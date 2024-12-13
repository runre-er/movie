package body.movieSystem.service;

import body.movieSystem.dto.CrewDTO;
import body.movieSystem.entity.Crew;
import body.movieSystem.mapper.CrewMapper;
import body.movieSystem.repository.CrewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrewService {

  private final CrewRepository crewRepository;
  private final CrewMapper crewMapper;

  public CrewDTO saveCrew(CrewDTO crewDTO) {
    Crew crew = crewMapper.toEntity(crewDTO);
    return crewMapper.toDTO(crewRepository.save(crew));
  }
}
