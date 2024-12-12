package body.movieSystem.dto;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
  private Long id;
  private String personName;
  private String personSurname;
  private LocalDate birthDate;
  private String birthCountry;
}
