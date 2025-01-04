package body.movieSystem.application.mapper;

import body.movieSystem.api.dto.general.UserDTO;
import body.movieSystem.api.dto.response.UserResponseDTO;
import body.movieSystem.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO toDTO(User user);

    UserResponseDTO toResponseDTO(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "comments", ignore = true)
    User toEntity(UserDTO userDTO);

    List<UserDTO> toDTOList(List<User> users);

    List<UserResponseDTO> toResponseDTOList(List<User> users);

    List<User> toEntityList(List<UserDTO> userDTO);
}
