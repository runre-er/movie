package body.movieSystem.mapper;

import body.movieSystem.dto.general.UserDTO;
import body.movieSystem.dto.response.UserResponseDTO;
import body.movieSystem.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO toDTO(User user);

    UserResponseDTO toResponseDTO(User user);

    @Mapping(target = "password", ignore = true)
    @Mapping(target = "comments", ignore = true)
    User toEntity(UserDTO userDTO);

    List<UserDTO> toDTOList(List<User> users);

    List<UserResponseDTO> toResponseDTOList(List<User> users);

    List<User> toEntityList(List<UserDTO> userDTO);
}
