package body.movieSystem.mapper;

import body.movieSystem.dto.RevenueDTO;
import body.movieSystem.entity.Revenue;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper
public interface RevenueMapper {
  RevenueDTO toDTO(Revenue revenue);

  Revenue toEntity(RevenueDTO revenueDTO);

  List<RevenueDTO> toDTOList(List<Revenue> revenues);

  List<Revenue> toEntityList(List<RevenueDTO> revenueDTOS);

}
