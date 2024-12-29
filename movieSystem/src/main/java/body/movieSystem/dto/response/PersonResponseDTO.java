package body.movieSystem.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonResponseDTO {
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
}
