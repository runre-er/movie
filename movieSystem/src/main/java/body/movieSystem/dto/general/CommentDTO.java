package body.movieSystem.dto.general;

import body.movieSystem.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    @NonNullId
    private Long id;
    @NotBlank
    @Size(min = 3, max = 1000)
    @Pattern(regexp = "^[a-zA-Z0-9 .,!?']*$")
    private String message;
    @NonNullId
    private Long production_id;
    @NonNullId
    private Long person_id;
}
