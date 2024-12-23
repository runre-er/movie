package body.movieSystem.dto;

import body.movieSystem.entity.Person;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TechCrewDTO {

  private Long id;
  private Long productionId;
  private Person person;
  private JobDTO role;
}
