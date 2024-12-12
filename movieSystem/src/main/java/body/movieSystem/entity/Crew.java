package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "crew")
public class Crew {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "production_id") // Foreign key
    private Production production;

    @ManyToOne
    @JoinColumn(name = "person_id") // Foreign key
    private Person crewMember;

    private String role;

}