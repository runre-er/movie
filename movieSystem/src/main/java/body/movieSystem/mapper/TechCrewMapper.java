package body.movieSystem.mapper;

import body.movieSystem.dto.cast.TechCrewDTO;
import body.movieSystem.entity.TechCrew;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface TechCrewMapper {

    @Mapping(target = "person", source = "person")
    TechCrewDTO toDTO(TechCrew techCrew);

    @Mapping(target = "production", ignore = true)
    TechCrew toEntity(TechCrewDTO techCrewDTO);

    List<TechCrewDTO> toDTOList(List<TechCrew> techCrews);

    List<TechCrew> toEntityList(List<TechCrewDTO> techCrewDTOS);
}
