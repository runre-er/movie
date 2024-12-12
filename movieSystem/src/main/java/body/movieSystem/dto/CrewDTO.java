package body.movieSystem.dto;

import body.movieSystem.entity.Crew;
import body.movieSystem.entity.Production;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CrewDTO {
  private Long id;
  private Long productionId;
  private Production production;
  private Crew crewMember;
  private Long personId;
  private String role;
}
