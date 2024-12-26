package body.movieSystem.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "persons")
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String surname;

  @Column(name = "birth_date")
  private LocalDate birthDate;

  @Column(name = "birth_country")
  private String birthCountry;
}
