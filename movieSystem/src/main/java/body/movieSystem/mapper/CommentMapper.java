package body.movieSystem.mapper;

import body.movieSystem.dto.CommentDTO;
import body.movieSystem.entity.Comment;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface CommentMapper {
  CommentDTO toDTO(Comment comment);

  Comment toEntity(CommentDTO commentDTO);

  List<CommentDTO> toDTOList(List<Comment> comments);

  List<Comment> toEntityList(List<CommentDTO> commentDTOS);
}
