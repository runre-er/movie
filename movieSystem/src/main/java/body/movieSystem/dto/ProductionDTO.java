package body.movieSystem.dto;

import body.movieSystem.dto.cast.ActorDTO;
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

  //private List<ActorDTO> actors;
}
