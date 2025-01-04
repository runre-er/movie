package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionDTO {
    @NonNullId
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String originalTitle;
    @Past
    private LocalDate releaseDate;
    @Size(min = 1)
    private int playTime;
    @NonNullId
    private Long country_id;
    @NonNullId
    private Long genre_id;
    @NonNullId
    private Long language_id;
}
