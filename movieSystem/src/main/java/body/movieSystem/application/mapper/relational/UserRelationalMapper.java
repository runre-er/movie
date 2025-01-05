package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.UserResponseDTO;
import body.movieSystem.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserRelationalMapper {

    UserResponseDTO toDTO(User user);

    List<UserResponseDTO> toDTOList(List<User> users);
}
