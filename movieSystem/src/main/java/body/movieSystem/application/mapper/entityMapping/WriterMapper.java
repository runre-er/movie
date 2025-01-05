package body.movieSystem.application.mapper.entityMapping;

import body.movieSystem.api.dto.general.WriterDTO;
import body.movieSystem.domain.entity.Writer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface WriterMapper {

    @Mapping(target = "production_id", source = "production.id")
    @Mapping(target = "person_id", source = "person.id")
    WriterDTO toDTO(Writer writer);

    @Mapping(target = "person", ignore = true)
    @Mapping(target = "production", ignore = true)
    Writer toEntity(WriterDTO writerDTO);

    List<WriterDTO> toDTOList(List<Writer> writers);

    List<Writer> toEntityList(List<WriterDTO> writerDTOS);
}
