package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "crews")
public class Crew {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "production_id")
  private Long productionId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "production_id", insertable = false, updatable = false) // Foreign key
  private Production production;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "person_id", insertable = false, updatable = false) // Foreign key
  private Person crewMember;

  @Column(name = "person_id")
  private Long personId;

  private String role;
}
