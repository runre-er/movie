package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TechCrewDTO {
    @NonNullId
    private Long id;
    @NonNullId
    private Long person_id;
    @NonNullId
    private Long job_id;
}
