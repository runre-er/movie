package body.movieSystem.service;

import body.movieSystem.dto.CategoryDTO;
import body.movieSystem.entity.Category;
import body.movieSystem.mapper.CategoryMapper;
import body.movieSystem.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

  private final CategoryRepository categoryRepository;
  private final CategoryMapper categoryMapper;

  public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
    Category category = categoryMapper.toEntity(categoryDTO);
    return categoryMapper.toDTO(categoryRepository.save(category));
  }
}
