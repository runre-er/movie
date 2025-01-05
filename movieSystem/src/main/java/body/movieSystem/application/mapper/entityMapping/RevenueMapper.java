package body.movieSystem.application.mapper.entityMapping;

import body.movieSystem.api.dto.general.RevenueDTO;
import body.movieSystem.domain.entity.Revenue;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RevenueMapper {
    RevenueDTO toDTO(Revenue revenue);

    Revenue toEntity(RevenueDTO revenueDTO);

    List<RevenueDTO> toDTOList(List<Revenue> revenues);

    List<Revenue> toEntityList(List<RevenueDTO> revenueDTOS);
}
