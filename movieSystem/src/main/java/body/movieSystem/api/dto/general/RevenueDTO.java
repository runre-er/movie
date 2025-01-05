package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import body.movieSystem.api.dto.validation.annotation.NotBlankMessage;
import body.movieSystem.api.dto.validation.annotation.SizeMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RevenueDTO {
    @NonNullId
    @Schema(hidden = true)
    private Long id;
    @NonNullId
    private Long productionId;
    @SizeMessage(min = 1)
    private Double amount;
    @NotBlankMessage
    private String source;
}
