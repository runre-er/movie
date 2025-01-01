package body.movieSystem.service;

import body.movieSystem.dto.general.UserDTO;
import body.movieSystem.dto.response.UserResponseDTO;
import body.movieSystem.entity.User;
import body.movieSystem.mapper.UserMapper;
import body.movieSystem.repository.UserRepository;
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
