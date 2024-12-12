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

  @Column(name = "person_name")
  private String personName;

  @Column(name = "person_surname")
  private String personSurname;

  @Column(name = "birth_date")
  private LocalDate birthDate;

  @Column(name = "birth_country")
  private String birthCountry;
}
