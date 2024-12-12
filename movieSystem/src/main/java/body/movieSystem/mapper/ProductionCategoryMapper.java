package body.movieSystem.mapper;

import body.movieSystem.dto.ProductionCategoryDTO;
import body.movieSystem.entity.ProductionCategory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductionCategoryMapper {
    ProductionCategoryDTO toDTO(ProductionCategory productionCategory);

    ProductionCategory toEntity(ProductionCategoryDTO productionCategoryDTO);

    List<ProductionCategoryDTO> toDTOList(List<ProductionCategory> productionCategories);

    List<ProductionCategory> toEntityList(List<ProductionCategoryDTO> productionCategoryDTOS);
}
