package body.movieSystem.mapper;

import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.entity.Production;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T00:30:28+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class ProductionMapperImpl implements ProductionMapper {

    @Override
    public ProductionDTO toDTO(Production production) {
        if ( production == null ) {
            return null;
        }

        ProductionDTO.ProductionDTOBuilder productionDTO = ProductionDTO.builder();

        productionDTO.id( production.getId() );
        productionDTO.productionCountry( production.getProductionCountry() );
        productionDTO.productionName( production.getProductionName() );
        productionDTO.releaseDate( production.getReleaseDate() );
        productionDTO.runtime( production.getRuntime() );
        productionDTO.originalTitle( production.getOriginalTitle() );

        return productionDTO.build();
    }

    @Override
    public Production toEntity(ProductionDTO productionDTO) {
        if ( productionDTO == null ) {
            return null;
        }

        Production production = new Production();

        production.setId( productionDTO.getId() );
        production.setProductionCountry( productionDTO.getProductionCountry() );
        production.setProductionName( productionDTO.getProductionName() );
        production.setReleaseDate( productionDTO.getReleaseDate() );
        if ( productionDTO.getRuntime() != null ) {
            production.setRuntime( productionDTO.getRuntime() );
        }
        production.setOriginalTitle( productionDTO.getOriginalTitle() );

        return production;
    }

    @Override
    public List<ProductionDTO> toDTOList(List<Production> productions) {
        if ( productions == null ) {
            return null;
        }

        List<ProductionDTO> list = new ArrayList<ProductionDTO>( productions.size() );
        for ( Production production : productions ) {
            list.add( toDTO( production ) );
        }

        return list;
    }

    @Override
    public List<Production> toEntityList(List<ProductionDTO> productionDTOS) {
        if ( productionDTOS == null ) {
            return null;
        }

        List<Production> list = new ArrayList<Production>( productionDTOS.size() );
        for ( ProductionDTO productionDTO : productionDTOS ) {
            list.add( toEntity( productionDTO ) );
        }

        return list;
    }
}
