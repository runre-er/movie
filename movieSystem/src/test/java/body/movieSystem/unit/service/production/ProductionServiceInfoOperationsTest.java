package body.movieSystem.unit.service.production;

import body.movieSystem.api.dto.response.ProductionInfoDTO;
import body.movieSystem.application.mapper.relational.ProductionRelationalMapper;
import body.movieSystem.application.service.ProductionService;
import body.movieSystem.common.prouction.ProductionDataBuilder;
import body.movieSystem.domain.entity.Production;
import body.movieSystem.domain.repository.ProductionRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductionServiceInfoOperationsTest {

    @Mock
    private ProductionRepository repository;

    @Mock
    private ProductionRelationalMapper relationalMapper;

    @InjectMocks
    private ProductionService productionService;

    private Production production;
    private ProductionInfoDTO productionInfoDTO;

    @BeforeEach
    void setUp() {
        production = ProductionDataBuilder.createSampleProduction();
        productionInfoDTO = ProductionDataBuilder.createSampleProductionInfoDTO();
    }

    @Test
    void getInfoByID_WhenExists_ReturnsProductionInfoDTO() {
        // Arrange
        when(repository.findById(1L)).thenReturn(Optional.of(production));
        when(relationalMapper.toInfoDTO(production)).thenReturn(productionInfoDTO);

        // Act
        ProductionInfoDTO result = productionService.getInfoByID(1L);

        // Assert
        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertNotNull(result.getLanguage());
        assertNotNull(result.getGenre());
        assertNotNull(result.getImdbScores());
        verify(repository).findById(1L);
        verify(relationalMapper).toInfoDTO(production);
    }

    @Test
    void getInfoByID_WhenNotExists_ThrowsResourceNotFoundException() {
        // Arrange
        when(repository.findById(99L)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(ResourceNotFoundException.class,
                () -> productionService.getInfoByID(99L));
        verify(repository).findById(99L);
    }
}
