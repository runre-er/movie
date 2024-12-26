package body.movieSystem.service;

import body.movieSystem.dto.RevenueDTO;
import body.movieSystem.entity.Revenue;
import body.movieSystem.mapper.RevenueMapper;
import body.movieSystem.repository.RevenueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RevenueService {

  private final RevenueRepository repository;
  private final RevenueMapper mapper;

  public RevenueDTO save(RevenueDTO revenueDTO) {
    Revenue revenue = mapper.toEntity(revenueDTO);
    return mapper.toDTO(repository.save(revenue));
  }
}

// todo specification arc resolver //
