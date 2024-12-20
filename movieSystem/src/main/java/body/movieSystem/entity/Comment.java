package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "comments")
public class Comment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String message;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "language_id")
  private Long languageId;

  @Column(name = "production_id")
  private Long productionId;
}
