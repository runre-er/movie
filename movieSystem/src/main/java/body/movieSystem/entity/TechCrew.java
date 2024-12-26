package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tech_crews")
public class TechCrew {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "production_id")
    private Production production;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;  // todo person lıstelerı olabılır

    @ManyToOne(fetch = FetchType.EAGER) // todo dene bı yapmıcak bu
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;
}
