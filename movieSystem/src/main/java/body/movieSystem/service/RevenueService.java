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

  private final RevenueRepository revenueRepository;
  private final RevenueMapper revenueMapper;

  public RevenueDTO saveRevenue(RevenueDTO revenueDTO) {
    Revenue revenue = revenueMapper.toEntity(revenueDTO);
    return revenueMapper.toDTO(revenueRepository.save(revenue));
  }
}

// todo specification arc resolver //
