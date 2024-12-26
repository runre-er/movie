package body.movieSystem.controller;
import body.movieSystem.dto.cast.ActorDTO;
import body.movieSystem.dto.cast.StarDTO;
import body.movieSystem.service.StarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/stars")
public class StarController {
  private final StarService service;

  @GetMapping
  public ResponseEntity<List<StarDTO>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<StarDTO> findById(@PathVariable Long id) {
    return ResponseEntity.ok(service.findById(id));
  }

  @PostMapping
  public ResponseEntity<StarDTO> save(@RequestBody StarDTO starDTO) {
    return ResponseEntity.ok(service.save(starDTO));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
  @GetMapping("/{id}/production")
  public ResponseEntity<List<StarDTO>> findByProductionId(@PathVariable Long id) {

    return ResponseEntity.ok(service.findByProductionId(id));
  }
}
