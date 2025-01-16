// unit/service/ProductionServiceBasicOperationsTest.java
package body.movieSystem.unit.service.production;

import body.movieSystem.api.dto.general.ProductionDTO;
import body.movieSystem.api.dto.response.ProductionResponseDTO;
import body.movieSystem.application.mapper.entityMapping.ProductionMapper;
import body.movieSystem.application.mapper.relational.ProductionRelationalMapper;
import body.movieSystem.application.service.ProductionService;
import body.movieSystem.common.prouction.ProductionDataBuilder;
import body.movieSystem.domain.entity.Production;
import body.movieSystem.domain.repository.ProductionRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductionServiceBasicOperationsTest {
    @Mock
    private ProductionMapper mapper;
    @Mock
    private ProductionRepository repository;
    @Mock
    private ProductionRelationalMapper relationalMapper;
    @InjectMocks
    private ProductionService productionService;

    @Test
    void findById_WhenExists_ReturnsProductionResponseDTO() {
        Production production = ProductionDataBuilder.createSampleProduction();
        ProductionResponseDTO expectedResponse = ProductionDataBuilder.createSampleProductionResponseDTO();

        when(repository.findById(1L)).thenReturn(Optional.of(production));
        when(relationalMapper.toDTO(production)).thenReturn(expectedResponse);

        ProductionResponseDTO result = productionService.findById(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("Test Movie", result.getTitle());
        verify(repository).findById(1L);
    }

    @Test
    void findById_WhenNotExists_ThrowsResourceNotFoundException() {
        when(repository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () ->
                productionService.findById(99L)
        );
        verify(repository).findById(99L);
    }

    @Test
    void findAll_ReturnsPageOfProductionResponseDTO() {
        Pageable pageable = PageRequest.of(0, 10);
        Production production = ProductionDataBuilder.createSampleProduction();
        ProductionResponseDTO responseDTO = ProductionDataBuilder.createSampleProductionResponseDTO();
        Page<Production> productionPage = new PageImpl<>(
                Collections.singletonList(production), pageable, 1
        );

        when(repository.findAll(pageable)).thenReturn(productionPage);
        when(relationalMapper.toDTO(production)).thenReturn(responseDTO);

        Page<ProductionResponseDTO> result = productionService.findAll(pageable);

        assertNotNull(result);
        assertEquals(1, result.getTotalElements());
        assertEquals(responseDTO, result.getContent().get(0));
        verify(repository).findAll(pageable);
    }

    @Test
    void save_ReturnsProductionDTO() {
        Production production = ProductionDataBuilder.createSampleProduction();
        ProductionDTO productionDTO = ProductionDataBuilder.createSampleProductionDTO();

        when(mapper.toEntity(productionDTO)).thenReturn(production);
        when(repository.save(production)).thenReturn(production);
        when(mapper.toDTO(production)).thenReturn(productionDTO);

        ProductionDTO result = productionService.save(productionDTO);

        assertNotNull(result);
        assertEquals(productionDTO.getId(), result.getId());
        assertEquals(productionDTO.getTitle(), result.getTitle());
        verify(repository).save(production);
    }
}