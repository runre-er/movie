package body.movieSystem.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "sur_name", nullable = false)
    private String surName;

    @Column(nullable = false, unique = true)
    private String nick;

    @Column(name = "email", nullable = false, unique = true)
    @Email(message = "invalid email!")
    private String email;

    @Column(name = "password", nullable = false, length = 60)
    private String password;

    @Column(name = "registration_time", columnDefinition = "DATE", nullable = false)
    private LocalDate registrationTime;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;
}
