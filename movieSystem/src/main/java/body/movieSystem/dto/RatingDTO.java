package body.movieSystem.dto;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RatingDTO {
  private Long id;
  private Long productionId;
  private Long userId;
  private Double userRating;
  private String userComment;
  private LocalDate userRatingDate;
}
