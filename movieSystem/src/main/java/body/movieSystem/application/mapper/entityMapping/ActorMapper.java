package body.movieSystem.application.mapper.entityMapping;

import body.movieSystem.api.dto.general.ActorDTO;
import body.movieSystem.domain.entity.Actor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ActorMapper {

    @Mapping(target = "productionId", source = "production.id")
    @Mapping(target = "personId", source = "person.id")
    ActorDTO toDTO(Actor actor);

    @Mapping(target = "person", ignore = true)
    @Mapping(target = "production", ignore = true)
    Actor toEntity(ActorDTO actorDTO);

    List<ActorDTO> toDTOList(List<Actor> actors);

    List<Actor> toEntityList(List<ActorDTO> actorDTOs);
}
