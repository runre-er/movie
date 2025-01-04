package body.movieSystem.application.mapper;

import body.movieSystem.api.dto.general.RevenueDTO;
import body.movieSystem.api.dto.response.RevenueResponseDTO;
import body.movieSystem.domain.entity.Revenue;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RevenueMapper {
    RevenueDTO toDTO(Revenue revenue);

    RevenueResponseDTO toResponseDTO(Revenue revenue);

    Revenue toEntity(RevenueDTO revenueDTO);

    List<RevenueDTO> toDTOList(List<Revenue> revenues);

    List<RevenueResponseDTO> toResponseDTOList(List<Revenue> revenues);

    List<Revenue> toEntityList(List<RevenueDTO> revenueDTOS);

}
