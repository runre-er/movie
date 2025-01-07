package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.ProductionCastCrewDTO;
import body.movieSystem.domain.entity.Production;
import org.mapstruct.Mapper;

@Mapper
public interface ProductionCastCrewMapper {
    ProductionCastCrewDTO toDTO(Production production);
}