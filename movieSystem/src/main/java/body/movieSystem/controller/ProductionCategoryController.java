package body.movieSystem.controller;

import body.movieSystem.dto.ProductionCategoryDTO;
import body.movieSystem.service.ProductionCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/production-categories")
public class ProductionCategoryController {

  private final ProductionCategoryService productionCategoryService;

  @PostMapping
  public ResponseEntity<ProductionCategoryDTO> saveProductionCategory(@RequestBody ProductionCategoryDTO productionCategoryDTO) {

    return ResponseEntity.ok(productionCategoryService.saveProductionCategory(productionCategoryDTO));
  }
}
