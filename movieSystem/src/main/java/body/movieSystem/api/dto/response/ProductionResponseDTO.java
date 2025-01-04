package body.movieSystem.api.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionResponseDTO {
    private Long id;
    private String title;
    private String originalTitle;
    private LocalDate releaseDate;
    private int playTime;
}
