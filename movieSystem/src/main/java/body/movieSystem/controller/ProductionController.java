package body.movieSystem.controller;

import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.service.ProductionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/productions")
public class ProductionController {

  private final ProductionService service;

  @PostMapping
  public ResponseEntity<ProductionDTO> saveRevenue(@RequestBody ProductionDTO productionDTO) {
    return ResponseEntity.ok(service.saveProduction(productionDTO));
  }

  @GetMapping
  public ResponseEntity<Page<ProductionDTO>> test(Pageable pageable) {
    return ResponseEntity.ok(service.findAllPageable(pageable));
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<ProductionDTO>> findProduction(@PathVariable Long id) {
    return ResponseEntity.ok(service.findProductionById(id));
  }


  // todo  fıltre lı olarak dene ,  arc resolver bununla alakalı ıkısını bırlestır ,arc resolver
  // ıcınde bır fonksıyon
  // todo ıkı adet degıslen alıyor , fıltre elemanı ve pageable olarak
}
