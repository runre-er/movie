package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import body.movieSystem.api.dto.validation.annotation.NotBlankMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LanguageDTO {
    @NonNullId
    @Schema(hidden = true)
    private Long id;
    @NotBlankMessage
    private String name;
}
