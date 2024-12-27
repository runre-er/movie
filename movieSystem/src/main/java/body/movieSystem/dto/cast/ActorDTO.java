package body.movieSystem.dto.cast;

import body.movieSystem.dto.validation.annotation.NonNullId;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActorDTO {
    @NonNullId
    private Long id;
    private PersonDTO person;
}
