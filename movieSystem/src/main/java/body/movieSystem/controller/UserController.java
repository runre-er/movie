package body.movieSystem.controller;

import body.movieSystem.dto.general.UserDTO;
import body.movieSystem.dto.response.UserResponseDTO;
import body.movieSystem.service.UserService;
import body.movieSystem.spec.UserSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(service.save(userDTO));
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<UserResponseDTO>> filter(UserSpec spec,
                                                        Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
