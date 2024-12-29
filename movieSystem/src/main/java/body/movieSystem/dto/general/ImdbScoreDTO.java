package body.movieSystem.dto.general;

import body.movieSystem.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImdbScoreDTO {
    @NonNullId
    private Long id;
    @Size(min = 0, max = 10)
    private Double score;
    @Size(min = 1)
    private Long votesCount; //todo burada ek fonksıyonlar olcak
    @NonNullId
    private Long productionId;
}
