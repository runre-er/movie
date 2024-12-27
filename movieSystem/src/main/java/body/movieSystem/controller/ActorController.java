package body.movieSystem.controller;

import body.movieSystem.dto.cast.ActorDTO;
import body.movieSystem.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/actors")
public class ActorController {

    private final ActorService service;

    @GetMapping
    public ResponseEntity<List<ActorDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ActorDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<ActorDTO> save(@RequestBody ActorDTO actorDTO) {
        return ResponseEntity.ok(service.save(actorDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}/production")
    public ResponseEntity<List<ActorDTO>> findByProductionId(@PathVariable Long id) {
        return ResponseEntity.ok(service.findByProductionId(id));
    }
}
