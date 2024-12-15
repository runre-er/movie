package body.movieSystem.controller;

import body.movieSystem.dto.CategoryDTO;
import body.movieSystem.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {

  private final CategoryService categoryService;

  @PostMapping
  public ResponseEntity<CategoryDTO> saveCategory(@RequestBody CategoryDTO categoryDTO) {
    return ResponseEntity.ok(categoryService.saveCategory(categoryDTO));
  }
}
