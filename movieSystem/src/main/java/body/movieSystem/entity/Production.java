package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "production")
public class Production {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "production_country")
    private String productionCountry;

    @Column(name = "production_name")
    private String productionName;

    @Column(name = "release_date", columnDefinition = "TIMESTAMP")
    private LocalDate releaseDate;

    private int runtime;

    @Column(name = "original_title")
    private String originalTitle;

    @OneToMany(mappedBy = "production") // todo burada lazy gerekebılır
    private List<Rating> ratings;

    @OneToMany(cascade = CascadeType.REMOVE)// todo dene bı yapmıcak bu
    @JoinColumn(name = "production_id", insertable = false, updatable = false)
    private List<Revenue> revenues;

    @OneToMany(mappedBy = "production", cascade = CascadeType.ALL)
    private List<Crew> crewList;

    @OneToMany(mappedBy = "production", cascade = CascadeType.ALL)
    private List<ProductionCategory> productionCategories;
}