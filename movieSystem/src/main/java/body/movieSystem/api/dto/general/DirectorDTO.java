package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DirectorDTO {
    @NonNullId
    @Schema(hidden = true)
    private Long id;
    @NonNullId
    private Long productionId;
    @NonNullId
    private Long personId;
}
