package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "imdb_scores")
public class ImdbScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double score;

    @Column(name = "votes_count")
    private Long votesCount;

    @Column(name = "production_id")
    private Long productionId;
}
