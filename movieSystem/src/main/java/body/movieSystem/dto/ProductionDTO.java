package body.movieSystem.dto;

import body.movieSystem.entity.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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
  private Set<PersonDTO> actors;
  private Set<PersonDTO> writers;
  private Set<PersonDTO> directors;
  private Set<PersonDTO> stars;
  private String languageId;
  private Country country;
  private String genreId;
  private List<Comment> comments;
  private List<ImdbScore> imdbScores;
  private List<Revenue> revenues;
}
