package body.movieSystem.service;

import body.movieSystem.dto.cast.TechCrewDTO;
import body.movieSystem.entity.TechCrew;
import body.movieSystem.mapper.TechCrewMapper;
import body.movieSystem.repository.TechCrewRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TechCrewService {

  private final TechCrewRepository repository;
  private final TechCrewMapper mapper;

  public List<TechCrewDTO> findAll() {
    return repository.findAll().stream()
            .map(mapper::toDTO)
            .collect(Collectors.toList());
  }

  public TechCrewDTO findById(Long id) {
    return repository
        .findById(id)
        .map(mapper::toDTO)
        .orElseThrow(() -> new EntityNotFoundException("Actor not found with id: " + id));
  }

  public TechCrewDTO save(TechCrewDTO techCrewDTO) {
    TechCrew entity = mapper.toEntity(techCrewDTO);
    return mapper.toDTO(repository.save(entity));
  }

  public void delete(Long id) {
    if (!repository.existsById(id)) {
      throw new EntityNotFoundException("Actor not found with id: " + id);
    }
    repository.deleteById(id);
  }
}
