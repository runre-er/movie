package body.movieSystem.service;

import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.entity.Production;
import body.movieSystem.mapper.ProductionMapper;
import body.movieSystem.repository.ProductionRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductionService {

  private final ProductionMapper mapper;
  private final ProductionRepository repository;

  public ProductionDTO saveProduction(ProductionDTO productionDTO) {
    Production production = mapper.toEntity(productionDTO);
    return mapper.toDTO(repository.save(production));
  }

  public Page<ProductionDTO> findAllPageable(Pageable pageable) {
    return repository.findAll(pageable).map(mapper::toDTO);
  }

  public Optional<ProductionDTO> findProductionById(Long productionId) {
    return repository.findByIdWithAllRelations(productionId).map(mapper::toDTO);
  }
}

// todo specification arc resolver //
