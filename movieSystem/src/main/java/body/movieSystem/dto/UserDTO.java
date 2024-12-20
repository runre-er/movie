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
  private String name;
  private String surName;
  private String nick;
  private String email;
  private LocalDate registrationTime;
}
