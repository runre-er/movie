package body.movieSystem.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

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

    @ManyToOne(fetch = FetchType.LAZY) // todo dene bı yapmıcak bu
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id", nullable = false)
    private Genre genre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "production_id", insertable = false, updatable = false)
    private List<Revenue> revenues;

    @OneToMany(cascade = CascadeType.REMOVE) // todo dene bı yapmıcak bu
    @JoinColumn(name = "production_id", insertable = false, updatable = false)
    private List<ImdbScore> imdbScores;

    @OneToMany(mappedBy = "production")
    private List<Comment> comments;

    @OneToMany(mappedBy = "production", fetch = FetchType.LAZY)
    private List<Actor> actors;

    @OneToMany(mappedBy = "production", fetch = FetchType.LAZY)
    private List<Writer> writers;

    @OneToMany(mappedBy = "production", fetch = FetchType.LAZY)
    private List<Director> directors;

    @OneToMany(mappedBy = "production", fetch = FetchType.LAZY)
    private List<Star> stars;

    @OneToMany(mappedBy = "production", fetch = FetchType.LAZY)
    private List<TechCrew> techCrews;
}
