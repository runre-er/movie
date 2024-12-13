package body.movieSystem.service;

import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.entity.Production;
import body.movieSystem.mapper.ProductionMapper;
import body.movieSystem.repository.ProductionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductionService {

  private final ProductionRepository productionRepository;
  private final ProductionMapper productionMapper;

  public ProductionDTO saveProduction(ProductionDTO productionDTO) {
    Production production = productionMapper.toEntity(productionDTO);
    return productionMapper.toDTO(productionRepository.save(production));
  }
}

// todo specification arc resolver //
