package body.movieSystem.dto;

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
  private Long productionId;
  private Category category;
  private Long categoryId;
}
