package body.movieSystem.api.controller;

import body.movieSystem.api.dto.general.ProductionDTO;
import body.movieSystem.api.dto.response.ProductionCastCrewDTO;
import body.movieSystem.api.dto.response.ProductionResponseDTO;
import body.movieSystem.api.dto.response.TechCrewResponseDTO;
import body.movieSystem.application.service.ProductionService;
import body.movieSystem.application.spec.ProductionSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/productions")
public class ProductionController {

    private final ProductionService service;

    @GetMapping
    public ResponseEntity<Page<ProductionResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }
    @GetMapping("/{id}")
    public ProductionResponseDTO findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id)).getBody();
    }
    @GetMapping("/{id}/cast-crew")
    public ProductionCastCrewDTO findCastCrewById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findCastCrewByProductionId(id)).getBody();
    }
    @GetMapping("/{id}/tech-crew")
    public List<TechCrewResponseDTO> findTechCrewById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findTechCrewByProductionId(id)).getBody();
    }
    @PostMapping
    public ResponseEntity<ProductionDTO> save(@RequestBody ProductionDTO productionDTO) {
        return ResponseEntity.ok(service.save(productionDTO));
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<ProductionResponseDTO>> filter(ProductionSpec spec, Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
    @GetMapping("/top/{limit}")
    public List<ProductionResponseDTO> getTop(@PathVariable Long limit) {
        return ResponseEntity.ok(service.getTop(limit)).getBody();
    }
}
