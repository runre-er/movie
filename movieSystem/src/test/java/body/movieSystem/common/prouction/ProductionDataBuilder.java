// common/TestDataBuilder.java
package body.movieSystem.common.prouction;

import body.movieSystem.api.dto.general.GenreDTO;
import body.movieSystem.api.dto.general.LanguageDTO;
import body.movieSystem.api.dto.general.ProductionDTO;
import body.movieSystem.api.dto.response.*;
import body.movieSystem.domain.entity.Production;

import java.time.LocalDate;
import java.util.List;

public class ProductionDataBuilder {
    public static Production createSampleProduction() {
        Production production = new Production();
        production.setId(1L);
        production.setTitle("Test Movie");
        production.setOriginalTitle("Test Original");
        production.setReleaseDate(LocalDate.of(2023, 1, 1));
        production.setPlayTime(120);
        return production;
    }
    public static ProductionDTO createSampleProductionDTO() {
        return ProductionDTO.builder()
                .id(1L)
                .title("Test Movie")
                .originalTitle("Test Original")
                .releaseDate(LocalDate.of(2023, 1, 1))
                .playTime(120)
                .country_id(1L)
                .genre_id(1L)
                .language_id(1L)
                .build();
    }
    public static ProductionResponseDTO createSampleProductionResponseDTO() {
        return ProductionResponseDTO.builder()
                .id(1L)
                .title("Test Movie")
                .originalTitle("Test Original")
                .releaseDate(LocalDate.of(2023, 1, 1))
                .playTime(120)
                .build();
    }
    public static ProductionCastCrewDTO createSampleCastCrewDTO() {
        return ProductionCastCrewDTO.builder()
                .actors(List.of(new ActorResponseDTO()))
                .writers(List.of(new WriterResponseDTO()))
                .directors(List.of(new DirectorResponseDTO()))
                .stars(List.of(new StarResponseDTO()))
                .build();
    }
    public static ProductionInfoDTO createSampleProductionInfoDTO() {
        return ProductionInfoDTO.builder()
                .id(1L)
                .language(new LanguageDTO())
                .genre(new GenreDTO())
                .imdbScores(List.of(new ImdbScoreResponseDTO()))
                .build();
    }
}