package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.UserDTO;
import body.movieSystem.api.dto.response.UserResponseDTO;
import body.movieSystem.application.mapper.UserMapper;
import body.movieSystem.domain.entity.User;
import body.movieSystem.domain.repository.UserRepository;
import body.movieSystem.exception.unchecked.UserOperationException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public List<UserResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public UserResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
    }
    public UserDTO save(UserDTO userDTO) {
        if (repository.existsByEmail(userDTO.getEmail())) {
            throw new UserOperationException("Email is already in use: " + userDTO.getEmail());
        }
        if (repository.existsByNick(userDTO.getNick())) {
            throw new UserOperationException("Nick is already in use: " + userDTO.getNick());
        }
        User entity = mapper.toEntity(userDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("User not found with id: " + id);
        }
        repository.deleteById(id);
    }
    public Page<UserResponseDTO> filter(Specification<User> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(mapper::toResponseDTO);
    }
}
