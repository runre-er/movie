package body.movieSystem.dto;

import lombok.*;

import java.util.List;

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
