package body.movieSystem.dto;

import lombok.*;

import java.time.LocalDate;

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
