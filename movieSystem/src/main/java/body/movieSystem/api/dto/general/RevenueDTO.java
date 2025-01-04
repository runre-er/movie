package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RevenueDTO {
    @NonNullId
    private Long id;
    @NonNullId
    private Long productionId;
    @Size(min = 1)
    private Double amount;
    @NotBlank
    private String source;
}
