package body.movieSystem.dto.cast;

import body.movieSystem.dto.validation.annotation.NonNullId;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WriterDTO {
  @NonNullId private Long id;
  private PersonDTO person;
}
