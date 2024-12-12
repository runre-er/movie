package body.movieSystem.mapper;

import body.movieSystem.dto.CategoryDTO;
import body.movieSystem.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryDTO toDTO(Category category);

    @Mapping(target = "productionCategories", ignore = true)
    Category toEntity(CategoryDTO categoryDTO);

    List<CategoryDTO> toDTOList(List<Category> categories);

    List<Category> toEntityList(List<CategoryDTO> categoryDTOS);
}
