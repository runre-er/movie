package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LanguageDTO {
    @NonNullId
    private Long id;
    @NotBlank
    private String name;
}
