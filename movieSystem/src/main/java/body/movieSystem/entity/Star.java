package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "stars")
public class Star {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "production_id")
    private Production production;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
