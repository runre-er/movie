package body.movieSystem.api.controller;

import body.movieSystem.api.dto.general.UserDTO;
import body.movieSystem.api.dto.response.UserResponseDTO;
import body.movieSystem.application.service.UserService;
import body.movieSystem.application.spec.UserSpec;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    @GetMapping
    public ResponseEntity<Page<UserResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
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
    public ResponseEntity<UserDTO> save(@Valid @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(service.save(userDTO));
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<UserResponseDTO>> filter(UserSpec spec,
                                                        Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
