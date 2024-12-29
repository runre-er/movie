package body.movieSystem.mapper;

import body.movieSystem.dto.general.DirectorDTO;
import body.movieSystem.dto.response.DirectorResponseDTO;
import body.movieSystem.entity.Director;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface DirectorMapper {

    @Mapping(target = "production_id", ignore = true)
    @Mapping(target = "person_id", ignore = true)
    DirectorDTO toDTO(Director director);

    @Mapping(target = "person", source = "person")
    DirectorResponseDTO toResponseDTO(Director director);

    @Mapping(target = "person", ignore = true)
    @Mapping(target = "production", ignore = true)
    Director toEntity(DirectorDTO directorDTO);

    List<DirectorDTO> toDTOList(List<Director> directors);

    List<DirectorResponseDTO> toResponseDTOList(List<Director> directors);

    List<Director> toEntityList(List<DirectorDTO> directorDTOS);
}
