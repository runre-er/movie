package body.movieSystem.mapper;

import body.movieSystem.dto.ProductionCategoryDTO;
import body.movieSystem.entity.ProductionCategory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T00:30:27+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class ProductionCategoryMapperImpl implements ProductionCategoryMapper {

    @Override
    public ProductionCategoryDTO toDTO(ProductionCategory productionCategory) {
        if ( productionCategory == null ) {
            return null;
        }

        ProductionCategoryDTO.ProductionCategoryDTOBuilder productionCategoryDTO = ProductionCategoryDTO.builder();

        productionCategoryDTO.id( productionCategory.getId() );
        productionCategoryDTO.productionId( productionCategory.getProductionId() );
        productionCategoryDTO.category( productionCategory.getCategory() );
        productionCategoryDTO.categoryId( productionCategory.getCategoryId() );

        return productionCategoryDTO.build();
    }

    @Override
    public ProductionCategory toEntity(ProductionCategoryDTO productionCategoryDTO) {
        if ( productionCategoryDTO == null ) {
            return null;
        }

        ProductionCategory productionCategory = new ProductionCategory();

        productionCategory.setId( productionCategoryDTO.getId() );
        productionCategory.setProductionId( productionCategoryDTO.getProductionId() );
        productionCategory.setCategory( productionCategoryDTO.getCategory() );
        productionCategory.setCategoryId( productionCategoryDTO.getCategoryId() );

        return productionCategory;
    }

    @Override
    public List<ProductionCategoryDTO> toDTOList(List<ProductionCategory> productionCategories) {
        if ( productionCategories == null ) {
            return null;
        }

        List<ProductionCategoryDTO> list = new ArrayList<ProductionCategoryDTO>( productionCategories.size() );
        for ( ProductionCategory productionCategory : productionCategories ) {
            list.add( toDTO( productionCategory ) );
        }

        return list;
    }

    @Override
    public List<ProductionCategory> toEntityList(List<ProductionCategoryDTO> productionCategoryDTOS) {
        if ( productionCategoryDTOS == null ) {
            return null;
        }

        List<ProductionCategory> list = new ArrayList<ProductionCategory>( productionCategoryDTOS.size() );
        for ( ProductionCategoryDTO productionCategoryDTO : productionCategoryDTOS ) {
            list.add( toEntity( productionCategoryDTO ) );
        }

        return list;
    }
}
