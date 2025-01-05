package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.TechCrewResponseDTO;
import body.movieSystem.domain.entity.TechCrew;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface TechCrewRelationalMapper {

    @Mapping(target = "person", source = "person")
    TechCrewResponseDTO toDTO(TechCrew techCrew);

    List<TechCrewResponseDTO> toDTOList(List<TechCrew> techCrews);
}
