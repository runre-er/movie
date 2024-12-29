package body.movieSystem.dto.general;

import body.movieSystem.dto.validation.annotation.NonNullId;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO { //todo admın only
    @NonNullId
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String surName;
    @NotBlank
    @UniqueElements
    @Size(min = 3, max = 20)
    private String nick;
    @Email
    @NotBlank
    private String email;
    private LocalDate registrationTime;
}
