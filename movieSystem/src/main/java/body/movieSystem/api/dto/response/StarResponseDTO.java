package body.movieSystem.api.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StarResponseDTO {
    private Long id;
    private PersonResponseDTO person;
}
