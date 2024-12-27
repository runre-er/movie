package body.movieSystem.mapper;

import body.movieSystem.dto.cast.DirectorDTO;
import body.movieSystem.entity.Director;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface DirectorMapper {
    @Mapping(target = "person", source = "person")
    DirectorDTO toDTO(Director director);

    @Mapping(target = "production", ignore = true)
    Director toEntity(DirectorDTO directorDTO);

    List<DirectorDTO> toDTOList(List<Director> directors);

    List<Director> toEntityList(List<DirectorDTO> directorDTOS);
}
