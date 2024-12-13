package body.movieSystem.dto;

import java.time.LocalDate;

import body.movieSystem.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RatingDTO {
  private Long id;
  @NonNullId private Long productionId;
  @NonNullId private Long userId;
  private Double userRating;
  @NotBlank private String userComment;
  private LocalDate userRatingDate;
}
