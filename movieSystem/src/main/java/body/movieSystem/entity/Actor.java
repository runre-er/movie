package body.movieSystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "actors")
public class Actor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "production_id", nullable = false) // Foreign key
  @JsonBackReference
  private Production production;

  @ManyToOne
  @JoinColumn(name = "person_id", nullable = false) // Foreign key
  @JsonManagedReference
  private Person person;
}
