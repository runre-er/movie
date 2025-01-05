package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.WriterResponseDTO;
import body.movieSystem.domain.entity.Writer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface WriterRelationalMapper {

    @Mapping(target = "person", source = "person")
    WriterResponseDTO toDTO(Writer writer);

    List<WriterResponseDTO> toDTOList(List<Writer> writers);
}
