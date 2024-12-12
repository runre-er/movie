package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "revenues")
public class Revenue {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "production_id")
  private Long productionId;

  @Column(name = "revenue_amount")
  private Double revenueAmount;

  @Column(name = "revenue_source")
  private String revenueSource;
}
