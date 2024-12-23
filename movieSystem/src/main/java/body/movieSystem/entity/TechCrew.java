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

  @Column(name = "production_id")
  private Long productionId;

  @ManyToOne(fetch = FetchType.EAGER) // todo dene bı yapmıcak bu
  @JoinColumn(name = "person_id", nullable = false)
  private Person person;

  @ManyToOne(fetch = FetchType.EAGER) // todo dene bı yapmıcak bu
  @JoinColumn(name = "role_id", nullable = false)
  private Job job;
}
