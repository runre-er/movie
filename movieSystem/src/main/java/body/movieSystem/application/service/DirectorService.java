package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.DirectorDTO;
import body.movieSystem.api.dto.response.DirectorResponseDTO;
import body.movieSystem.domain.entity.Director;
import body.movieSystem.application.mapper.DirectorMapper;
import body.movieSystem.domain.repository.DirectorRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public List<DirectorResponseDTO> findByProductionId(Long id) {
        return mapper.toResponseDTOList(repository.findByProductionId(id));
    }
    public List<DirectorResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public DirectorResponseDTO findById(Long id) {
        return repository
                .findById(id)
                .map(mapper::toResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("Director not found with id: " + id));
    }
    public DirectorDTO save(DirectorDTO directorDTO) {
        Director entity = mapper.toEntity(directorDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Director not found with id: " + id);
        }
        repository.deleteById(id);
    }
    public Page<DirectorResponseDTO> filter(Specification<Director> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(mapper::toResponseDTO);
    }
}

