package body.movieSystem.mapper;

import body.movieSystem.dto.general.StarDTO;
import body.movieSystem.dto.response.StarResponseDTO;
import body.movieSystem.entity.Star;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface StarMapper {

    @Mapping(target = "production_id", ignore = true)
    @Mapping(target = "person_id", ignore = true)
    StarDTO toDTO(Star star);

    @Mapping(target = "person", source = "person")
    StarResponseDTO toResponseDTO(Star star);

    @Mapping(target = "person", ignore = true)
    @Mapping(target = "production", ignore = true)
    Star toEntity(StarDTO starDTO);

    List<StarDTO> toDTOList(List<Star> stars);

    List<StarResponseDTO> toResponseDTOList(List<Star> stars);

    List<Star> toEntityList(List<StarDTO> starDTOS);
}
