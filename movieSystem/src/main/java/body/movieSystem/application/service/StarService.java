package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.StarDTO;
import body.movieSystem.api.dto.response.StarResponseDTO;
import body.movieSystem.application.mapper.entityMapping.StarMapper;
import body.movieSystem.application.mapper.relational.StarRelationalMapper;
import body.movieSystem.domain.entity.Star;
import body.movieSystem.domain.repository.StarRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StarService {

    private final StarRepository repository;
    private final StarMapper mapper;
    private final StarRelationalMapper relationalMapper;

    public Page<StarResponseDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public StarResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(relationalMapper::toDTO)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }
    public StarDTO save(StarDTO starDTO) {
        Star entity = mapper.toEntity(starDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("User", "id", id);
        }
        repository.deleteById(id);
    }
    public Page<StarResponseDTO> filter(Specification<Star> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
    public List<StarResponseDTO> findByProductionId(Long id) {
        return relationalMapper.toDTOList(repository.findByProductionId(id));
    }
}

