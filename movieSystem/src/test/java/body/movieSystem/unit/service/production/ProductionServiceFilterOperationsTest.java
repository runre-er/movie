// unit/service/ProductionServiceFilterOperationsTest.java
package body.movieSystem.unit.service.production;

import body.movieSystem.api.dto.response.ImdbScoreResponseDTO;
import body.movieSystem.api.dto.response.ProductionResponseDTO;
import body.movieSystem.application.mapper.relational.ProductionRelationalMapper;
import body.movieSystem.application.service.ImdbScoreService;
import body.movieSystem.application.service.ProductionService;
import body.movieSystem.common.prouction.ProductionDataBuilder;
import body.movieSystem.domain.entity.Production;
import body.movieSystem.domain.repository.ProductionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductionServiceFilterOperationsTest {
    @Mock
    private ProductionRepository repository;
    @Mock
    private ProductionRelationalMapper relationalMapper;
    @Mock
    private ImdbScoreService imdbScoreService;
    @InjectMocks
    private ProductionService productionService;

    @Test
    void filter_ReturnsPageOfProductionResponseDTO() {
        Pageable pageable = PageRequest.of(0, 10);
        Specification<Production> spec = mock(Specification.class);
        Production production = ProductionDataBuilder.createSampleProduction();
        ProductionResponseDTO responseDTO = ProductionDataBuilder.createSampleProductionResponseDTO();
        Page<Production> productionPage = new PageImpl<>(
                Collections.singletonList(production), pageable, 1
        );

        when(repository.findAll(spec, pageable)).thenReturn(productionPage);
        when(relationalMapper.toDTO(production)).thenReturn(responseDTO);

        Page<ProductionResponseDTO> result = productionService.filter(spec, pageable);

        assertNotNull(result);
        assertEquals(1, result.getTotalElements());
        assertEquals(responseDTO, result.getContent().get(0));
        verify(repository).findAll(spec, pageable);
    }

    @Test
    void getTop_ReturnsListOfProductionResponseDTO() {
        Long limit = 5L;
        Production production = ProductionDataBuilder.createSampleProduction();
        ProductionResponseDTO responseDTO = ProductionDataBuilder.createSampleProductionResponseDTO();
        List<ImdbScoreResponseDTO> imdbScores = Collections.singletonList(
                ImdbScoreResponseDTO.builder().productionId(1L).build()
        );

        when(imdbScoreService.getTop(limit)).thenReturn(imdbScores);
        when(repository.findAllById(any())).thenReturn(Collections.singletonList(production));
        when(relationalMapper.toDTOList(any())).thenReturn(Collections.singletonList(responseDTO));

        List<ProductionResponseDTO> result = productionService.getTop(limit);

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(responseDTO, result.get(0));
        verify(imdbScoreService).getTop(limit);
    }
}