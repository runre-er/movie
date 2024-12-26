package body.movieSystem.dto;

import body.movieSystem.entity.*;
import java.util.List;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionInfoDTO {
  private Long id;
  private LanguageDTO language;
  private GenreDTO genre;
  private List<ImdbScoreDTO> imdbScores;
}
