package body.movieSystem.dto;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
  private Long id;
  private String username;
  private String email;
  private String password;
  private LocalDate createdTime;
}
