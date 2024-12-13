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

  @Column(name = "user_name",nullable = false, unique = true)
  private String userName;

  @Column(name = "email",nullable = false, unique = true)
  private String email;

  @Column(name = "password",nullable = false)
  private String password;

  @Column(
      name = "created_time",
      columnDefinition = "TIMESTAMP",
      nullable = false)
  private LocalDate createdTime;

  @OneToMany
  @JoinColumn(name = "user_id")
  private List<Rating> ratings;
}
