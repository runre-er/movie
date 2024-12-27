package body.movieSystem.dto;

import body.movieSystem.dto.cast.ActorDTO;
import body.movieSystem.dto.cast.DirectorDTO;
import body.movieSystem.dto.cast.StarDTO;
import body.movieSystem.dto.cast.WriterDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionCrewDTO {
    private List<ActorDTO> actors;
    private List<WriterDTO> writers;
    private List<DirectorDTO> directors;
    private List<StarDTO> stars;
}
