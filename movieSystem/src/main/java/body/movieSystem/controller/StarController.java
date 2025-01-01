package body.movieSystem.controller;

import body.movieSystem.dto.general.StarDTO;
import body.movieSystem.dto.response.StarResponseDTO;
import body.movieSystem.service.StarService;
import body.movieSystem.spec.StarSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/stars")
public class StarController {

    private final StarService service;

    @GetMapping
    public ResponseEntity<List<StarResponseDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<StarResponseDTO> findById(@PathVariable Long id) {
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
    public ResponseEntity<List<StarResponseDTO>> findByProductionId(@PathVariable Long id) {

        return ResponseEntity.ok(service.findByProductionId(id));
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<StarResponseDTO>> filter(StarSpec spec,
                                                        Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
