package body.movieSystem.dto.general;

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
    @NonNullId
    private Long production_id;
    @NonNullId
    private Long person_id;
}
