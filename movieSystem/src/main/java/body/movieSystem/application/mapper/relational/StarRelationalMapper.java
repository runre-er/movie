package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.StarResponseDTO;
import body.movieSystem.domain.entity.Star;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface StarRelationalMapper {

    @Mapping(target = "person", source = "person")
    StarResponseDTO toDTO(Star star);

    List<StarResponseDTO> toDTOList(List<Star> stars);
}
