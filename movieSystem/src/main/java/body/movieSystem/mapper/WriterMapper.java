package body.movieSystem.mapper;

import body.movieSystem.dto.general.WriterDTO;
import body.movieSystem.dto.response.WriterResponseDTO;
import body.movieSystem.entity.Writer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface WriterMapper {

    @Mapping(target = "production_id", ignore = true)
    @Mapping(target = "person_id", ignore = true)
    WriterDTO toDTO(Writer writer);

    @Mapping(target = "person", source = "person")
    WriterResponseDTO toResponseDTO(Writer writer);

    @Mapping(target = "person", ignore = true)
    @Mapping(target = "production", ignore = true)
    Writer toEntity(WriterDTO writerDTO);

    List<WriterDTO> toDTOList(List<Writer> writers);

    List<WriterResponseDTO> toResponseDTOList(List<Writer> writers);

    List<Writer> toEntityList(List<WriterDTO> writerDTOS);

}
