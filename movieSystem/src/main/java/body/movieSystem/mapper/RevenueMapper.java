package body.movieSystem.mapper;

import body.movieSystem.dto.RevenueDTO;
import body.movieSystem.entity.Revenue;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RevenueMapper {
    RevenueDTO toDTO(Revenue revenue);

    Revenue toEntity(RevenueDTO revenueDTO);

    List<RevenueDTO> toDTOList(List<Revenue> revenues);

    List<Revenue> toEntityList(List<RevenueDTO> revenueDTOS);

}
