package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@Entity
@Table (name ="rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="production_id")
    private int productionId;

    @Column (name="user_rating")
    private double userRating;

    @Column (name="user_count")
    private int userCount;

}
