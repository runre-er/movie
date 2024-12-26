package body.movieSystem.service;

import body.movieSystem.dto.UserDTO;
import body.movieSystem.entity.User;
import body.movieSystem.mapper.UserMapper;
import body.movieSystem.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository repository;
  private final UserMapper mapper;

  public List<UserDTO> findAll() {
    return repository.findAll()
            .stream()
            .map(mapper::toDTO)
            .collect(Collectors.toList());
  }

  public UserDTO findById(Long id) {
    return repository.findById(id)
            .map(mapper::toDTO)
            .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
  }

  public UserDTO save(UserDTO userDTO) {
    User entity = mapper.toEntity(userDTO);
    return mapper.toDTO(repository.save(entity));
  }

  public void delete(Long id) {
    if (!repository.existsById(id)) {
      throw new EntityNotFoundException("User not found with id: " + id);
    }
    repository.deleteById(id);
  }
}
