package body.movieSystem.dto;

import body.movieSystem.dto.validation.annotation.NonNullId;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryDTO {
    @NonNullId
    private Long id;
    private String name;
}
