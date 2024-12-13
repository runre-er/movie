package body.movieSystem.service;

import body.movieSystem.dto.ProductionCategoryDTO;
import body.movieSystem.entity.ProductionCategory;
import body.movieSystem.mapper.ProductionCategoryMapper;
import body.movieSystem.repository.ProductionCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductionCategoryService {

  private final ProductionCategoryRepository productionCategoryRepository;
  private final ProductionCategoryMapper productionCategoryMapper;

  public ProductionCategoryDTO saveProductionCategory(ProductionCategoryDTO productionCategoryDTO) {
    ProductionCategory productionCategory = productionCategoryMapper.toEntity(productionCategoryDTO);
    return productionCategoryMapper.toDTO(productionCategoryRepository.save(productionCategory));
  }
}
