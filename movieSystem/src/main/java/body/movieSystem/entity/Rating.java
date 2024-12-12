package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne // todo buraya lazy gerekebılır
    @JoinColumn(name = "production_id", referencedColumnName = "id", nullable = false)
    private Production production;

    @Column(name = "user_rating")
    private double userRating;

    @Column(name = "user_votes_count")
    private int userVotesCount;

}
