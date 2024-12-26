package body.movieSystem.service;

import body.movieSystem.dto.cast.ActorDTO;
import body.movieSystem.dto.cast.DirectorDTO;
import body.movieSystem.entity.Actor;
import body.movieSystem.mapper.ActorMapper;
import body.movieSystem.repository.ActorRepository;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorService {

  private final ActorRepository repository;
  private final ActorMapper mapper;

  public List<ActorDTO> findByProductionId(Long id) {
    return
            repository.findByProductionId(id).stream().map(mapper::toDTO).collect(Collectors.toList());
  }

  public List<ActorDTO> findAll() {
    return repository.findAll()
            .stream()
            .map(mapper::toDTO)
            .collect(Collectors.toList());
  }

  public ActorDTO findById(Long id) {
    return repository.findById(id)
            .map(mapper::toDTO)
            .orElseThrow(() -> new EntityNotFoundException("Actor not found with id: " + id));
  }

  public ActorDTO save(ActorDTO actorDTO) {
    Actor entity = mapper.toEntity(actorDTO);
    return mapper.toDTO(repository.save(entity));
  }

  public void delete(Long id) {
    if (!repository.existsById(id)) {
      throw new EntityNotFoundException("Actor not found with id: " + id);
    }
    repository.deleteById(id);
  }
}

// todo specification arc resolver //
