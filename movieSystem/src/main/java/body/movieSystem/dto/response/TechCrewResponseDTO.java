package body.movieSystem.dto.response;

import body.movieSystem.dto.general.JobDTO;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TechCrewResponseDTO {
    private Long id;
    private PersonResponseDTO person;
    private JobDTO job;
}
