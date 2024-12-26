package body.movieSystem.mapper;

import body.movieSystem.dto.cast.ActorDTO;
import body.movieSystem.entity.Actor;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ActorMapper {

  @Mapping(target = "person", source = "person")
  ActorDTO toDTO(Actor actor);

  @Mapping(target = "production", ignore = true)
  Actor toEntity(ActorDTO actorDTO);

  List<ActorDTO> toDTOList(List<Actor> actors);

  List<Actor> toEntityList(List<ActorDTO> actorDTOs);
}
