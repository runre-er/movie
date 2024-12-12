package body.movieSystem.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RevenueDTO {
    private Long id;
    private Long productionId;
    private Double revenueAmount;
    private String revenueSource;
}