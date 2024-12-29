package body.movieSystem.dto.general;

import body.movieSystem.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobDTO {
    @NonNullId
    private Long id;
    @NotBlank
    private String name;
}
