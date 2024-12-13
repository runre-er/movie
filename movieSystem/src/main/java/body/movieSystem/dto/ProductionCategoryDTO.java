package body.movieSystem.dto;

import body.movieSystem.dto.validation.annotation.NonNullId;
import body.movieSystem.entity.Category;
import body.movieSystem.entity.Production;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionCategoryDTO {
  private Long id;
  @NonNullId private Long productionId;
  private Category category;
  @NonNullId private Long categoryId;
}
