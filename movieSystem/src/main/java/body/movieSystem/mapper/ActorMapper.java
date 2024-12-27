package body.movieSystem.mapper;

import body.movieSystem.dto.cast.ActorDTO;
import body.movieSystem.entity.Actor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ActorMapper {

    @Mapping(target = "person", source = "person")
    ActorDTO toDTO(Actor actor);

    @Mapping(target = "production", ignore = true)
    Actor toEntity(ActorDTO actorDTO);

    List<ActorDTO> toDTOList(List<Actor> actors);

    List<Actor> toEntityList(List<ActorDTO> actorDTOs);
}
