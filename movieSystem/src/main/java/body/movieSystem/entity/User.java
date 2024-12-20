package body.movieSystem.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

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
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "registration_time", columnDefinition = "TIMESTAMP", nullable = false)
  private LocalDate registrationTime;

  @OneToMany(cascade = CascadeType.REMOVE) // todo dene bı yapmıcak bu
  @JoinColumn(name = "user_id", insertable = false, updatable = false)
  private List<Comment> comments;
}
