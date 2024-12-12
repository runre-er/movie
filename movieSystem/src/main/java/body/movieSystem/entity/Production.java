package body.movieSystem.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productions")
public class Production {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "production_country")
  private String productionCountry;

  @Column(name = "production_name")
  private String productionName;

  @Column(name = "release_date", columnDefinition = "TIMESTAMP")
  private LocalDate releaseDate;

  private int runtime;

  @Column(name = "original_title")
  private String originalTitle;

  @OneToMany
  @JoinColumn(name = "production_id")
  private List<Rating> ratings;

  @OneToMany(cascade = CascadeType.REMOVE) // todo dene bı yapmıcak bu
  @JoinColumn(name = "production_id", insertable = false, updatable = false)
  private List<Revenue> revenues;

  @OneToMany(
      mappedBy = "production",
      cascade = CascadeType.ALL,
      fetch = FetchType.LAZY,
      orphanRemoval = true)
  private List<Crew> crewList;

  @OneToMany
  @JoinColumn(name = "production_id", insertable = false, updatable = false)
  private List<ProductionCategory> productionCategories;
}
