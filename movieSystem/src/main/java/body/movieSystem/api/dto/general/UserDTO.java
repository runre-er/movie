package body.movieSystem.api.dto.general;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotBlank(message = "Name cannot be empty")
    private String name;
    @NotBlank(message = "Surname cannot be empty")
    private String surName;
    @NotBlank(message = "Nickname cannot be empty")
    @Size(min = 3, max = 20, message = "Nickname must be between 3 and 20 characters")
    private String nick;
    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be empty")
    private String email;
    @NotBlank(message = "1")
    @NotBlank(message = "Password cannot be empty")
    @Size(min = 3, max = 20, message = "Password must be between 3 and 20 characters")
    private String password;
    private LocalDate registrationTime = LocalDate.now();
}
