package body.movieSystem.dto.cast;

import body.movieSystem.dto.validation.annotation.NonNullId;
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
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String birthCountry;
}
