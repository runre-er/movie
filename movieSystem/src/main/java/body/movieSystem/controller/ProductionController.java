package body.movieSystem.controller;

import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.service.ProductionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productions")
public class ProductionController {

  private final ProductionService productionService;

  @PostMapping
  public ResponseEntity<ProductionDTO> saveRevenue(@RequestBody ProductionDTO productionDTO) {

    return ResponseEntity.ok(productionService.saveProduction(productionDTO));
  }
}
