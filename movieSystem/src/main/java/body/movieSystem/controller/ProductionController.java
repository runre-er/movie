package body.movieSystem.controller;

import body.movieSystem.dto.general.ProductionDTO;
import body.movieSystem.dto.response.ProductionCrewDTO;
import body.movieSystem.dto.response.ProductionResponseDTO;
import body.movieSystem.service.ProductionService;
import body.movieSystem.spec.ProductionSpec;
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
    @GetMapping("/filter")
    public ResponseEntity<Page<ProductionResponseDTO>> filter(ProductionSpec spec,
                                                              Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
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

    // todo  specification arg resolver  ---- pageable için

}
