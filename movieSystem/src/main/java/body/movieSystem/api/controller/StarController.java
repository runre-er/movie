package body.movieSystem.api.controller;

import body.movieSystem.api.dto.general.StarDTO;
import body.movieSystem.api.dto.response.StarResponseDTO;
import body.movieSystem.application.service.StarService;
import body.movieSystem.application.spec.StarSpec;
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
    public ResponseEntity<Page<StarResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
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
