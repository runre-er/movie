package body.movieSystem.mapper;

import body.movieSystem.dto.general.ProductionDTO;
import body.movieSystem.dto.response.ProductionCrewDTO;
import body.movieSystem.dto.response.ProductionResponseDTO;
import body.movieSystem.entity.Production;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ProductionMapper {

    @Mapping(target = "language_id", ignore = true)
    @Mapping(target = "genre_id", ignore = true)
    @Mapping(target = "country_id", ignore = true)
    ProductionDTO toDTO(Production production);

    ProductionResponseDTO toResponseDTO(Production production);

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

    List<ProductionDTO> toDTOList(List<ProductionDTO> productionDTO);

    List<ProductionResponseDTO> toResponseDTOList(List<ProductionDTO> productionDTO);

    ProductionCrewDTO toCrewDTO(Production production);
}
