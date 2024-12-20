package body.movieSystem.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

  @Column(name = "title")
  private String title;

  @Column(name = "original_title")
  private String originalTitle;

  @Column(name = "release_date", columnDefinition = "TIMESTAMP")
  private LocalDate releaseDate;

  @Column(name = "play_time")
  private int playTime;

  @Column(name = "language_id")
  private String languageId;

  @Column(name = "genre_id")
  private String genreId;

  @ManyToOne(fetch = FetchType.EAGER) // todo dene bı yapmıcak bu
  @JoinColumn(name = "country_id", nullable = false)
  private Country country;

  @OneToMany(cascade = CascadeType.REMOVE) // todo dene bı yapmıcak bu
  @JoinColumn(name = "production_id", insertable = false, updatable = false)
  private List<Revenue> revenues;

  @OneToMany(cascade = CascadeType.REMOVE) // todo dene bı yapmıcak bu
  @JoinColumn(name = "production_id", insertable = false, updatable = false)
  private List<ImdbScore> imdbScores;

  @OneToMany(cascade = CascadeType.REMOVE) // todo dene bı yapmıcak bu
  @JoinColumn(name = "production_id", insertable = false, updatable = false)
  private List<Star> stars;

  @OneToMany(cascade = CascadeType.REMOVE) // todo dene bı yapmıcak bu
  @JoinColumn(name = "production_id", insertable = false, updatable = false)
  private List<Writer> writers;

  @OneToMany(cascade = CascadeType.REMOVE) // todo dene bı yapmıcak bu
  @JoinColumn(name = "production_id", insertable = false, updatable = false)
  private List<Director> directors;

  @OneToMany(cascade = CascadeType.REMOVE) // todo dene bı yapmıcak bu
  @JoinColumn(name = "production_id", insertable = false, updatable = false)
  private List<Comment> comments;

  @OneToMany(mappedBy = "production", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JsonManagedReference
  private List<Actor> prod_actors;



}
