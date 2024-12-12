package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "production_categories")
public class ProductionCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "production_id")
  private Long productionId;

  @ManyToOne
  @JoinColumn(name = "category_id", insertable = false, updatable = false)
  private Category category;

  @Column(name = "category_id")
  private Long categoryId;
}
