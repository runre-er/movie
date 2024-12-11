package body.movieSystem.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@Entity
@Table (name ="person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="person_name")
    private String personName;

    @Column (name="person_surname")
    private String personSurname;

    @Column (name="birth_date")
    private Time birthDate;

    @Column (name="born_country")
    private String bornCountry;

}
