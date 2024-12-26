package body.movieSystem.controller;
import body.movieSystem.dto.cast.DirectorDTO;
import body.movieSystem.service.DirectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/directors")
public class DirectorController {
  private final DirectorService service;

  @GetMapping
  public ResponseEntity<List<DirectorDTO>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<DirectorDTO> findById(@PathVariable Long id) {
    return ResponseEntity.ok(service.findById(id));
  }

  @PostMapping
  public ResponseEntity<DirectorDTO> save(@RequestBody DirectorDTO directorDTO) {
    return ResponseEntity.ok(service.save(directorDTO));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }

  @GetMapping("/{id}/production")
  public ResponseEntity<List<DirectorDTO>> findByProductionId(@PathVariable Long id) {

    return ResponseEntity.ok(service.findByProductionId(id));
  }

}
