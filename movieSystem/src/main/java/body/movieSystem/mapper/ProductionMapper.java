package body.movieSystem.mapper;

import body.movieSystem.dto.ProductionCrewDTO;
import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.entity.Production;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Set;

@Mapper
public interface ProductionMapper {

    ProductionDTO toDTO(Production production);

    @Mapping(target = "writers", ignore = true)
    @Mapping(target = "stars", ignore = true)
    @Mapping(target = "revenues", ignore = true)
    @Mapping(target = "language", ignore = true)
    @Mapping(target = "imdbScores", ignore = true)
    @Mapping(target = "genre", ignore = true)
    @Mapping(target = "directors", ignore = true)
    @Mapping(target = "country", ignore = true)
    @Mapping(target = "comments", ignore = true)
    @Mapping(target = "actors", ignore = true)
    Production toEntity(ProductionDTO productionDTO);

    Set<ProductionDTO> toDTOSet(Set<Production> productions);

    Set<Production> toEntitySet(Set<ProductionDTO> productionDTOS);

    ProductionCrewDTO toCrewDTO(Production production);
}
