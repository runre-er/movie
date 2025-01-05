package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.RevenueResponseDTO;
import body.movieSystem.domain.entity.Revenue;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RevenueRelationalMapper {

    RevenueResponseDTO toDTO(Revenue revenue);

    List<RevenueResponseDTO> toDTOList(List<Revenue> revenues);
}
