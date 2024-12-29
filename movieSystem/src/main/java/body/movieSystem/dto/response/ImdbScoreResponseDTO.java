package body.movieSystem.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImdbScoreResponseDTO {
    private Long id;
    private Double score;
    private Long votesCount;
    private Long productionId;
}
