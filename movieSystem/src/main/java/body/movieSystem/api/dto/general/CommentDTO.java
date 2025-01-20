package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import body.movieSystem.api.dto.validation.annotation.SizeMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    @NonNullId
    @Schema(hidden = true)
    private Long id;
    @SizeMessage(min = 3, max = 1000)
    @Pattern(regexp = "^[a-zA-Z0-9 .,!?']*$")
    private String message;
    @NonNullId
    private Long productionId;
    @NonNullId
    private Long personId;
}
