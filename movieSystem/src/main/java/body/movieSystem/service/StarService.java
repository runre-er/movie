package body.movieSystem.service;

import body.movieSystem.dto.cast.ActorDTO;
import body.movieSystem.dto.cast.StarDTO;
import body.movieSystem.entity.Star;
import body.movieSystem.mapper.StarMapper;
import body.movieSystem.repository.StarRepository;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarService {

  private final StarRepository repository;
  private final StarMapper mapper;


  public List<StarDTO> findByProductionId(Long id) {
    return
            repository.findByProductionId(id).stream().map(mapper::toDTO).collect(Collectors.toList());
  }

  public List<StarDTO> findAll() {
    return repository.findAll()
            .stream()
            .map(mapper::toDTO)
            .collect(Collectors.toList());
  }

  public StarDTO findById(Long id) {
    return repository.findById(id)
            .map(mapper::toDTO)
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
