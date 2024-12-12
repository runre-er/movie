package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  // TODO silme işlemi denenmeli
  @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
  private List<ProductionCategory> productionCategories;
}
