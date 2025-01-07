package body.movieSystem.api.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionCastCrewDTO {
    private List<ActorResponseDTO> actors;
    private List<WriterResponseDTO> writers;
    private List<DirectorResponseDTO> directors;
    private List<StarResponseDTO> stars;
}
