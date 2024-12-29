package body.movieSystem.dto.response;

import body.movieSystem.dto.general.PersonDTO;
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
