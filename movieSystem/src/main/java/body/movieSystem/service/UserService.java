package body.movieSystem.service;

import body.movieSystem.dto.UserDTO;
import body.movieSystem.entity.User;
import body.movieSystem.mapper.UserMapper;
import body.movieSystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  public UserDTO saveUser(UserDTO userDTO) {
    User user = userMapper.toEntity(userDTO);
    return userMapper.toDTO(userRepository.save(user));
  }
}
