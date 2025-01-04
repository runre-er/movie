package body.movieSystem.api.controller;

import body.movieSystem.api.dto.general.TechCrewDTO;
import body.movieSystem.api.dto.response.TechCrewResponseDTO;
import body.movieSystem.application.service.TechCrewService;
import body.movieSystem.application.spec.TechCrewSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tech-crews")
public class TechCrewController {

    private final TechCrewService service;

    @GetMapping
    public ResponseEntity<List<TechCrewResponseDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<TechCrewResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<TechCrewDTO> save(@RequestBody TechCrewDTO techCrewDTO) {
        return ResponseEntity.ok(service.save(techCrewDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}/production")
    public ResponseEntity<List<TechCrewResponseDTO>> findByProductionId(@PathVariable Long id) {
        return ResponseEntity.ok(service.findByProductionId(id));
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<TechCrewResponseDTO>> filter(TechCrewSpec spec,
                                                            Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
