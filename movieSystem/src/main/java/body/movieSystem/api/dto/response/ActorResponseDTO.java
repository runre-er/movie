package body.movieSystem.api.dto.response;

import body.movieSystem.api.dto.general.PersonDTO;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActorResponseDTO {
    private Long id;
    private PersonDTO person;
}
