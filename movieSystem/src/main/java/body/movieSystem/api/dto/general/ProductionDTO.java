package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import body.movieSystem.api.dto.validation.annotation.NotBlankMessage;
import body.movieSystem.api.dto.validation.annotation.SizeMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionDTO {
    @NonNullId
    @Schema(hidden = true)
    private Long id;
    @NotBlankMessage
    private String title;
    @NotBlankMessage
    private String originalTitle;
    @Past
    private LocalDate releaseDate;
    @SizeMessage(min = 1)
    private int playTime;
    @NonNullId
    private Long countryId;
    @NonNullId
    private Long genreId;
    @NonNullId
    private Long languageId;
}
