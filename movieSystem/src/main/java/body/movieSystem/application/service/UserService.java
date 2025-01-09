package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.UserDTO;
import body.movieSystem.api.dto.response.UserResponseDTO;
import body.movieSystem.application.mapper.entityMapping.UserMapper;
import body.movieSystem.application.mapper.relational.UserRelationalMapper;
import body.movieSystem.domain.entity.User;
import body.movieSystem.domain.repository.UserRepository;
import body.movieSystem.exception.unchecked.DuplicateResourceException;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;
    private final UserRelationalMapper relationalMapper;

    public Page<UserResponseDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public UserResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(relationalMapper::toDTO)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }
    public UserDTO save(UserDTO userDTO) {
        if (repository.existsByEmail(userDTO.getEmail())) {
            throw new DuplicateResourceException("Email is already in use: " + userDTO.getEmail());
        }
        if (repository.existsByNick(userDTO.getNick())) {
            throw new DuplicateResourceException("Nick is already in use: " + userDTO.getNick());
        }
        User entity = mapper.toEntity(userDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("User", "id", id);
        }
        repository.deleteById(id);
    }
    public Page<UserResponseDTO> filter(Specification<User> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
}
