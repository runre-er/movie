package body.movieSystem.dto;

import body.movieSystem.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RevenueDTO {
  private Long id;
  @NonNullId private Long productionId;

  @DecimalMin(value = "0.0", inclusive = false)
  private Double revenueAmount;

  @NotBlank private String revenueSource;
}
