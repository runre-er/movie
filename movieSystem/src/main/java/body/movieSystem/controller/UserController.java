package body.movieSystem.controller;

import body.movieSystem.dto.UserDTO;
import body.movieSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  @PostMapping
  public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO) {

    return ResponseEntity.ok(userService.saveUser(userDTO));
  }
}
