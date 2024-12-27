package body.movieSystem.mapper;

import body.movieSystem.dto.cast.StarDTO;
import body.movieSystem.entity.Star;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface StarMapper {
    @Mapping(target = "person", source = "person")
    StarDTO toDTO(Star star);

    @Mapping(target = "production", ignore = true)
    Star toEntity(StarDTO starDTO);

    List<StarDTO> toDTOList(List<Star> stars);

    List<Star> toEntityList(List<StarDTO> starDTOS);
}
