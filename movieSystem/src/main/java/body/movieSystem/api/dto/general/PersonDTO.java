package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
    @NonNullId
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @Past
    private LocalDate birthDate;
    @NotBlank
    private String birthCountry;
}
