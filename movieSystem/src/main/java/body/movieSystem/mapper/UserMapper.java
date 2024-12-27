package body.movieSystem.mapper;

import body.movieSystem.dto.UserDTO;
import body.movieSystem.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO toDTO(User user);

    User toEntity(UserDTO userDTO);

    List<UserDTO> toDTOList(List<User> users);

    List<User> toEntityList(List<UserDTO> userDTO);
}
