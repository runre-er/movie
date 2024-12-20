package body.movieSystem.dto;

import body.movieSystem.entity.*;
import java.time.LocalDate;
import java.util.List;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionDTO {
  private Long id;
  private String title;
  private String originalTitle;
  private LocalDate releaseDate;
  private int playTime;
  private List<Director> directors;
  private List<Star> stars;
  private List<Actor> prod_actors;
  private String languageId;
  private Country country;
  private String genreId;
  private List<Writer> writers;
  private List<Comment> comments;
  private List<ImdbScore> imdbScores;
  private List<Revenue> revenues;
}
