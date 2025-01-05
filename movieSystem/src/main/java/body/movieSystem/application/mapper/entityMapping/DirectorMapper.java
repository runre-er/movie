package body.movieSystem.application.mapper.entityMapping;

import body.movieSystem.api.dto.general.DirectorDTO;
import body.movieSystem.domain.entity.Director;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface DirectorMapper {

    @Mapping(target = "production_id", source = "production.id")
    @Mapping(target = "person_id", source = "person.id")
    DirectorDTO toDTO(Director director);

    @Mapping(target = "person", ignore = true)
    @Mapping(target = "production", ignore = true)
    Director toEntity(DirectorDTO directorDTO);

    List<DirectorDTO> toDTOList(List<Director> directors);

    List<Director> toEntityList(List<DirectorDTO> directorDTOS);
}
