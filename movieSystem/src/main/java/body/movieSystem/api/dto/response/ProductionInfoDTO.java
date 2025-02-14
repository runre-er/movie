package body.movieSystem.api.dto.response;

import body.movieSystem.api.dto.general.GenreDTO;
import body.movieSystem.api.dto.general.LanguageDTO;
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
    private List<ImdbScoreResponseDTO> imdbScores;
}
