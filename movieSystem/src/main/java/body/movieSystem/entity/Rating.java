package body.movieSystem.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ratings")
public class Rating {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "production_id", nullable = false)
  private Long productionId;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "user_rating")
  private Double userRating;

  @Column(name = "user_comment")
  private String userComment;

  @Column(name = "user_rating_date", columnDefinition = "TIMESTAMP")
  private LocalDate userRatingDate;
}
