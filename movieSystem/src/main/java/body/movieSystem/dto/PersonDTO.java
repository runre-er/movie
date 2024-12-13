package body.movieSystem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
  private Long id;
  @NotBlank private String personName;
  @NotBlank private String personSurname;
  @NotNull private LocalDate birthDate;
  @NotBlank private String birthCountry;
}
