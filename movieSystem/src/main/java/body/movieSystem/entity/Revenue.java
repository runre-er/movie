package body.movieSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name ="revenue")
public class Revenue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="production_id")
    private int productionId;

    @Column (name="revenue_amount")
    private double revenueAmount;

    @Column (name="revenue_type")
    private int revenueType;

}