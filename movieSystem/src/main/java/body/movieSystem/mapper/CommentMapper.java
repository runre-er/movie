package body.movieSystem.mapper;

import body.movieSystem.dto.general.CommentDTO;
import body.movieSystem.dto.response.CommentResponseDTO;
import body.movieSystem.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface CommentMapper {

    @Mapping(target = "production_id", ignore = true)
    @Mapping(target = "person_id", ignore = true)
    CommentDTO toDTO(Comment comment);

    @Mapping(target = "user", source = "user")
    CommentResponseDTO toResponseDTO(Comment comment);

    List<CommentDTO> toDTOList(List<Comment> comments);

    Comment toEntity(CommentDTO commentDTO);

    List<CommentResponseDTO> toResponseDTOList(List<Comment> comments);

    List<Comment> toEntityList(List<CommentDTO> commentDTOS);
}
