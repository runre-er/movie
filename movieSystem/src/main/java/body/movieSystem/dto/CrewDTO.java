package body.movieSystem.dto;

import body.movieSystem.dto.validation.annotation.NonNullId;
import body.movieSystem.entity.Crew;
import body.movieSystem.entity.Production;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CrewDTO {
  private Long id;
  @NonNullId private Long productionId;
  private Production production;
  private Crew crewMember;
  @NonNullId private Long personId;
  @NotBlank private String role;
}
