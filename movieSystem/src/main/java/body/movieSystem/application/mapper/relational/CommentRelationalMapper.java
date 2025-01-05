package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.CommentResponseDTO;
import body.movieSystem.domain.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface CommentRelationalMapper {

    @Mapping(target = "user", source = "user")
    CommentResponseDTO toDTO(Comment comment);

    List<CommentResponseDTO> toDTOList(List<Comment> comments);
}
