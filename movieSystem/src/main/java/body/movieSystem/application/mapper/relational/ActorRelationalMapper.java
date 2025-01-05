package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.ActorResponseDTO;
import body.movieSystem.domain.entity.Actor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ActorRelationalMapper {

    @Mapping(target = "person", source = "person")
    ActorResponseDTO toDTO(Actor actor);

    List<ActorResponseDTO> toDTOList(List<Actor> actors);
}
