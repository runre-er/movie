package body.movieSystem.api.controller;

import body.movieSystem.api.dto.response.ActorResponseDTO;
import body.movieSystem.api.dto.general.ActorDTO;
import body.movieSystem.application.service.ActorService;
import body.movieSystem.application.spec.ActorSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/actors")
public class ActorController {

    private final ActorService service;

    @GetMapping
    public ResponseEntity<List<ActorResponseDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ActorResponseDTO> findById(@PathVariable Long id) {
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
    public ResponseEntity<List<ActorResponseDTO>> findByProductionId(@PathVariable Long id) {
        return ResponseEntity.ok(service.findByProductionId(id));
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<ActorResponseDTO>> filter(ActorSpec spec,
                                                         Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
