package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.ProductionCrewDTO;
import body.movieSystem.domain.entity.Production;
import org.mapstruct.Mapper;

@Mapper
public interface ProductionCrewMapper {
    ProductionCrewDTO toDTO(Production production);
}