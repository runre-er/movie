package body.movieSystem.controller;
import body.movieSystem.dto.ImdbScoreDTO;
import body.movieSystem.service.ImdbScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/imdb-scores")
public class ImdbScoreController {
  private final ImdbScoreService service;

  @GetMapping
  public ResponseEntity<List<ImdbScoreDTO>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<ImdbScoreDTO> findById(@PathVariable Long id) {
    return ResponseEntity.ok(service.findById(id));
  }

  @PostMapping
  public ResponseEntity<ImdbScoreDTO> save(@RequestBody ImdbScoreDTO imdbScoreDTO) {
    return ResponseEntity.ok(service.save(imdbScoreDTO));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}
