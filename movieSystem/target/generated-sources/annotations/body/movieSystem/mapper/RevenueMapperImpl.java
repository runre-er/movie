package body.movieSystem.mapper;

import body.movieSystem.dto.RevenueDTO;
import body.movieSystem.entity.Revenue;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-20T20:11:53+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class RevenueMapperImpl implements RevenueMapper {

    @Override
    public RevenueDTO toDTO(Revenue revenue) {
        if ( revenue == null ) {
            return null;
        }

        RevenueDTO.RevenueDTOBuilder revenueDTO = RevenueDTO.builder();

        revenueDTO.id( revenue.getId() );
        revenueDTO.productionId( revenue.getProductionId() );
        revenueDTO.amount( revenue.getAmount() );

        return revenueDTO.build();
    }

    @Override
    public Revenue toEntity(RevenueDTO revenueDTO) {
        if ( revenueDTO == null ) {
            return null;
        }

        Revenue revenue = new Revenue();

        revenue.setId( revenueDTO.getId() );
        revenue.setProductionId( revenueDTO.getProductionId() );
        revenue.setAmount( revenueDTO.getAmount() );

        return revenue;
    }

    @Override
    public List<RevenueDTO> toDTOList(List<Revenue> revenues) {
        if ( revenues == null ) {
            return null;
        }

        List<RevenueDTO> list = new ArrayList<RevenueDTO>( revenues.size() );
        for ( Revenue revenue : revenues ) {
            list.add( toDTO( revenue ) );
        }

        return list;
    }

    @Override
    public List<Revenue> toEntityList(List<RevenueDTO> revenueDTOS) {
        if ( revenueDTOS == null ) {
            return null;
        }

        List<Revenue> list = new ArrayList<Revenue>( revenueDTOS.size() );
        for ( RevenueDTO revenueDTO : revenueDTOS ) {
            list.add( toEntity( revenueDTO ) );
        }

        return list;
    }
}
