package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.StarDTO;
import body.movieSystem.api.dto.response.StarResponseDTO;
import body.movieSystem.domain.entity.Star;
import body.movieSystem.application.mapper.StarMapper;
import body.movieSystem.domain.repository.StarRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public List<StarResponseDTO> findByProductionId(Long id) {
        return mapper.toResponseDTOList(repository.findByProductionId(id));
    }
    public List<StarResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public StarResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("Star not found with id: " + id));
    }
    public StarDTO save(StarDTO starDTO) {
        Star entity = mapper.toEntity(starDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Star not found with id: " + id);
        }
        repository.deleteById(id);
    }
    public Page<StarResponseDTO> filter(Specification<Star> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(mapper::toResponseDTO);
    }
}

