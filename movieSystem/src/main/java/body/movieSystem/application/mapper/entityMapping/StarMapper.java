package body.movieSystem.application.mapper.entityMapping;

import body.movieSystem.api.dto.general.StarDTO;
import body.movieSystem.domain.entity.Star;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface StarMapper {

    @Mapping(target = "production_id", source = "production.id")
    @Mapping(target = "person_id", source = "person.id")
    StarDTO toDTO(Star star);

    @Mapping(target = "person", ignore = true)
    @Mapping(target = "production", ignore = true)
    Star toEntity(StarDTO starDTO);

    List<StarDTO> toDTOList(List<Star> stars);

    List<Star> toEntityList(List<StarDTO> starDTOS);
}
