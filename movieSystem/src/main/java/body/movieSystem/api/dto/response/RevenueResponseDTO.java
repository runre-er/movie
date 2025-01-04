package body.movieSystem.api.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RevenueResponseDTO {
    private Long id;
    private Double amount;
    private String source;
}
