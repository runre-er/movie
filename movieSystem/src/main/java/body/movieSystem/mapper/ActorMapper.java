package body.movieSystem.mapper;

import body.movieSystem.dto.general.ActorDTO;
import body.movieSystem.dto.response.ActorResponseDTO;
import body.movieSystem.entity.Actor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ActorMapper {

    ActorDTO toDTO(Actor actor);

    @Mapping(target = "person", source = "person")
    ActorResponseDTO toResponseDTO(Actor actor);

    @Mapping(target = "production", ignore = true)
    Actor toEntity(ActorDTO actorDTO);

    List<ActorDTO> toDTOList(List<Actor> actors);

    List<ActorResponseDTO> toResponseDTOList(List<Actor> actors);

    List<Actor> toEntityList(List<ActorDTO> actorDTOs);
}
