package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.ProductionResponseDTO;
import body.movieSystem.domain.entity.Production;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductionRelationalMapper {

    ProductionResponseDTO toDTO(Production production);

    List<ProductionResponseDTO> toDTOList(List<Production> production);
}
