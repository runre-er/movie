package body.movieSystem.api.controller;

import body.movieSystem.api.dto.general.ProductionDTO;
import body.movieSystem.api.dto.response.ProductionCrewDTO;
import body.movieSystem.api.dto.response.ProductionResponseDTO;
import body.movieSystem.application.service.ProductionService;
import body.movieSystem.application.spec.ProductionSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}/crew")
    public ProductionCrewDTO findCrewById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findCrewById(id)).getBody();
    }
    @PostMapping
    public ResponseEntity<ProductionDTO> save(@RequestBody ProductionDTO productionDTO) {
        return ResponseEntity.ok(service.save(productionDTO));
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<ProductionResponseDTO>> filter(ProductionSpec spec,
                                                              Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
