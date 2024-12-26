package body.movieSystem.mapper;

import body.movieSystem.dto.cast.TechCrewDTO;
import body.movieSystem.entity.TechCrew;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface TechCrewMapper {
    TechCrewDTO toDTO(TechCrew techCrew);
    TechCrew toEntity(TechCrewDTO techCrewDTO);
    List<TechCrewDTO> toDTOList(List<TechCrew> techCrews);
    List<TechCrew> toEntityList(List<TechCrewDTO> techCrewDTOS);
}
