package body.movieSystem.dto;

import body.movieSystem.dto.validation.annotation.NonNullId;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImdbScoreDTO {
    @NonNullId
    private Long id;
    private Double score;
    private Long votesCount;
    @NonNullId
    private Long productionId;
}
