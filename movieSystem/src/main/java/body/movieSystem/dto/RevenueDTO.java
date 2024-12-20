package body.movieSystem.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RevenueDTO {
  private Long id;
  private Long productionId;
  private Double amount;
  private String source;
}
