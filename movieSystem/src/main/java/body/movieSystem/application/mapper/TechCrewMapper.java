package body.movieSystem.application.mapper;

import body.movieSystem.api.dto.general.TechCrewDTO;
import body.movieSystem.api.dto.response.TechCrewResponseDTO;
import body.movieSystem.domain.entity.TechCrew;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface TechCrewMapper {

    @Mapping(target = "person_id", ignore = true)
    @Mapping(target = "job_id", ignore = true)
    TechCrewDTO toDTO(TechCrew techCrew);

    @Mapping(target = "person", source = "person")
    TechCrewResponseDTO toResponseDTO(TechCrew techCrew);

    @Mapping(target = "person", ignore = true)
    @Mapping(target = "job", ignore = true)
    @Mapping(target = "production", ignore = true)
    TechCrew toEntity(TechCrewDTO techCrewDTO);

    List<TechCrewDTO> toDTOList(List<TechCrew> techCrews);

    List<TechCrewResponseDTO> toResponseDTOList(List<TechCrew> techCrews);

    List<TechCrew> toEntityList(List<TechCrewDTO> techCrewDTOS);
}
