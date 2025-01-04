package body.movieSystem.api.dto.response;

import body.movieSystem.api.dto.general.JobDTO;
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
