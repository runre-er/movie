package body.movieSystem.mapper;

import body.movieSystem.dto.CrewDTO;
import body.movieSystem.entity.Crew;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CrewMapper {
    CrewDTO toDTO(Crew crew);

    Crew toEntity(CrewDTO crewDTO);

    List<CrewDTO> toDTOList(List<Crew> crews);

    List<Crew> toEntityList(List<CrewDTO> crewDTOS);
}
