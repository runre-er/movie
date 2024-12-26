package body.movieSystem.mapper;

import body.movieSystem.dto.cast.WriterDTO;
import body.movieSystem.entity.Writer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface WriterMapper {
    @Mapping(target = "person", source = "person")
    WriterDTO toDTO(Writer writer);
    @Mapping(target = "production", ignore = true)
    Writer toEntity(WriterDTO writerDTO);
    List<WriterDTO> toDTOList(List<Writer> writers);
    List<Writer> toEntityList(List<WriterDTO> writerDTOS);

}
