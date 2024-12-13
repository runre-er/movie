package body.movieSystem.dto;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
  private Long id;
  @NotBlank private String username;
  @NotBlank private String email;
  @NotBlank private String password;
  private LocalDate createdTime;
}
