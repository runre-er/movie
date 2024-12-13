package body.movieSystem.controller;

import body.movieSystem.dto.CrewDTO;
import body.movieSystem.service.CrewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/crews")
public class CrewController {

  private final CrewService crewService;

  @PostMapping
  public ResponseEntity<CrewDTO> saveCrew(@RequestBody CrewDTO crewDTO) {
    return ResponseEntity.ok(crewService.saveCrew(crewDTO));
  }
}
