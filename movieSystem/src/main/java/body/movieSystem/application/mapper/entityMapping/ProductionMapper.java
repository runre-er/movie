package body.movieSystem.application.mapper.entityMapping;

import body.movieSystem.api.dto.general.ProductionDTO;
import body.movieSystem.domain.entity.Production;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ProductionMapper {

    @Mapping(target = "languageId", ignore = true)
    @Mapping(target = "genreId", ignore = true)
    @Mapping(target = "countryId", ignore = true)
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

    List<ProductionDTO> toDTOList(List<Production> production);// todo burada hata var

    List<Production> toEntityList(List<ProductionDTO> productionDTOS);
}
