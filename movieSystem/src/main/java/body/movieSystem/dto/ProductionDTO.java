package body.movieSystem.dto;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionDTO {
  private Long id;
  private String productionCountry;
  private String productionName;
  private LocalDate releaseDate;
  private Integer runtime;
  private String originalTitle;
}
