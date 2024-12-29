package body.movieSystem.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionCrewDTO {
    private List<ActorResponseDTO> actors;
    private List<WriterResponseDTO> writers;
    private List<DirectorResponseDTO> directors;
    private List<StarResponseDTO> stars;
}
