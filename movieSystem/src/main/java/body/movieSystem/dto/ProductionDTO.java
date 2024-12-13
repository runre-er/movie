package body.movieSystem.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionDTO {
  private Long id;
  @NotBlank private String productionCountry;
  @NotBlank private String productionName;
  private LocalDate releaseDate;

  @Min(1)
  private Integer runtime;

  @NotBlank private String originalTitle;
}
