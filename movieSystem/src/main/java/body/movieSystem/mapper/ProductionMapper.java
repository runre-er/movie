package body.movieSystem.mapper;

import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.entity.Production;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ProductionMapper {
    ProductionDTO toDTO(Production production);

    @Mapping(target = "revenues", ignore = true)
    @Mapping(target = "ratings", ignore = true)
    @Mapping(target = "productionCategories", ignore = true)
    @Mapping(target = "crewList", ignore = true)
    Production toEntity(ProductionDTO productionDTO);

    List<ProductionDTO> toDTOList(List<Production> productions);

    List<Production> toEntityList(List<ProductionDTO> productionDTOS);
}
