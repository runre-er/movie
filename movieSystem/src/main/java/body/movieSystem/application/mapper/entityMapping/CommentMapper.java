package body.movieSystem.application.mapper.entityMapping;

import body.movieSystem.api.dto.general.CommentDTO;
import body.movieSystem.domain.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface CommentMapper {

    @Mapping(target = "productionId", ignore = true)
    @Mapping(target = "personId", ignore = true)
    CommentDTO toDTO(Comment comment);

    List<CommentDTO> toDTOList(List<Comment> comments);

    Comment toEntity(CommentDTO commentDTO);

    List<Comment> toEntityList(List<CommentDTO> commentDTOS);
}
