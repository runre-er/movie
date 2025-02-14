package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.DirectorDTO;
import body.movieSystem.api.dto.response.DirectorResponseDTO;
import body.movieSystem.application.mapper.entityMapping.DirectorMapper;
import body.movieSystem.application.mapper.relational.DirectorRelationalMapper;
import body.movieSystem.domain.entity.Director;
import body.movieSystem.domain.repository.DirectorRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DirectorService {

    private final DirectorRepository repository;
    private final DirectorMapper mapper;
    private final DirectorRelationalMapper relationalMapper;

    public Page<DirectorResponseDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public DirectorResponseDTO findById(Long id) {
        return repository
                .findById(id)
                .map(relationalMapper::toDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Director", "id", id));
    }
    public DirectorDTO save(DirectorDTO directorDTO) {
        Director entity = mapper.toEntity(directorDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Director", "id", id);
        }
        repository.deleteById(id);
    }
    public Page<DirectorResponseDTO> filter(Specification<Director> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
    public List<DirectorResponseDTO> findByProductionId(Long id) {
        return relationalMapper.toDTOList(repository.findByProductionId(id));
    }
}

