package body.movieSystem.controller;

import body.movieSystem.dto.general.DirectorDTO;
import body.movieSystem.dto.response.DirectorResponseDTO;
import body.movieSystem.service.DirectorService;
import body.movieSystem.spec.DirectorSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/directors")
public class DirectorController {

    private final DirectorService service;

    @GetMapping
    public ResponseEntity<List<DirectorResponseDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<DirectorResponseDTO> findById(@PathVariable Long id) {
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
    public ResponseEntity<List<DirectorResponseDTO>> findByProductionId(@PathVariable Long id) {
        return ResponseEntity.ok(service.findByProductionId(id));
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<DirectorResponseDTO>> filter(DirectorSpec spec,
                                                            Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
