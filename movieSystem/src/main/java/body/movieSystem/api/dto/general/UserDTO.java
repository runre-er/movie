package body.movieSystem.api.dto.general;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import body.movieSystem.api.dto.validation.annotation.NotBlankMessage;
import body.movieSystem.api.dto.validation.annotation.SizeMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NonNullId
    @Schema(hidden = true)
    private Long id;
    @NotBlankMessage
    private String name;
    @NotBlankMessage
    private String surName;
    @SizeMessage(min = 3, max = 20)
    private String nick;
    @Email(message = "Invalid email format")
    @NotBlankMessage
    private String email;
    @SizeMessage(min = 3, max = 20)
    private String password;
    @Schema(hidden = true)
    private LocalDate registrationTime = LocalDate.now();
}
