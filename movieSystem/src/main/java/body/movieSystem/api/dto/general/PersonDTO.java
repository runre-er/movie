package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import body.movieSystem.api.dto.validation.annotation.NotBlankMessage;
import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(hidden = true)
    private Long id;
    @NotBlankMessage
    private String name;
    @NotBlankMessage
    private String surname;
    @Past(message = "must be past time")
    private LocalDate birthDate;
    @NotBlankMessage
    private String birthCountry;
}
