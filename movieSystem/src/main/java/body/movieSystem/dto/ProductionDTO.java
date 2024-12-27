package body.movieSystem.dto;

import lombok.*;

import java.time.LocalDate;

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

    //private List<ActorDTO> actors;
}
