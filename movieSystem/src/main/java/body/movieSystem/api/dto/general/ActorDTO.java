package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActorDTO {
    @NonNullId
    @Schema(hidden = true)
    private Long id;
    @NonNullId
    private Long production_id;
    @NonNullId
    private Long person_id;
}
