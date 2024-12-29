package body.movieSystem.service;

import body.movieSystem.dto.general.StarDTO;
import body.movieSystem.dto.response.StarResponseDTO;
import body.movieSystem.entity.Star;
import body.movieSystem.mapper.StarMapper;
import body.movieSystem.repository.StarRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
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
}

// todo specification arc resolver //
