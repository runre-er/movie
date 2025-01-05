package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import body.movieSystem.api.dto.validation.annotation.SizeMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImdbScoreDTO {
    @NonNullId
    @Schema(hidden = true)
    private Long id;
    @SizeMessage(min = 0, max = 10)
    private Double score;
    @SizeMessage(min = 1)
    private Long votesCount; //todo burada ek fonksıyonlar olcak
    @NonNullId
    private Long productionId;
}

