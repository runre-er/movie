package body.movieSystem.controller;

import body.movieSystem.dto.UserDTO;
import body.movieSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

  private final UserService service;

  @PostMapping
  public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO) {

    return ResponseEntity.ok(service.save(userDTO));
  }
}
