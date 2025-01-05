package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.DirectorResponseDTO;
import body.movieSystem.domain.entity.Director;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface DirectorRelationalMapper {

    @Mapping(target = "person", source = "person")
    DirectorResponseDTO toDTO(Director director);

    List<DirectorResponseDTO> toDTOList(List<Director> directors);
}
