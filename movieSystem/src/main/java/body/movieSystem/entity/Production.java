package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@Entity
@Table (name ="production")
public class Production {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="production_name")
    private String productionName;

    @Column(name="production_country")
    private String productionCountry;

    private String title;

    @Column (name="release_date")
    private Time releaseDate;

    private String runtime;

}