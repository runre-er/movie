package body.movieSystem.unit;

import body.movieSystem.api.dto.general.ProductionDTO;
import body.movieSystem.api.dto.response.ImdbScoreResponseDTO;
import body.movieSystem.api.dto.response.ProductionResponseDTO;
import body.movieSystem.application.mapper.entityMapping.ProductionMapper;
import body.movieSystem.application.mapper.relational.ProductionCastCrewMapper;
import body.movieSystem.application.mapper.relational.ProductionRelationalMapper;
import body.movieSystem.application.service.ImdbScoreService;
import body.movieSystem.application.service.ProductionService;
import body.movieSystem.domain.entity.Production;
import body.movieSystem.domain.repository.ProductionRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductionServiceMethodsUnitTest {

    @Mock
    private ProductionMapper mapper;

    @Mock
    private ProductionRepository repository;

    @Mock
    private ProductionRelationalMapper relationalMapper;

    @Mock
    private ProductionCastCrewMapper productionCastCrewMapper;

    @Mock
    private ImdbScoreService imdbScoreService;

    @InjectMocks
    private ProductionService productionService;

    private Production production;
    private ProductionDTO productionDTO;
    private ProductionResponseDTO productionResponseDTO;

    @BeforeEach
    void setUp() {
        production = new Production();
        production.setId(1L);
        production.setTitle("Test Movie");
        production.setOriginalTitle("Test Original");
        production.setReleaseDate(LocalDate.of(2023, 1, 1));
        production.setPlayTime(120);

        productionDTO = ProductionDTO.builder()
                .id(1L)
                .title("Test Movie")
                .originalTitle("Test Original")
                .releaseDate(LocalDate.of(2023, 1, 1))
                .playTime(120)
                .build();

        productionResponseDTO = ProductionResponseDTO.builder()
                .id(1L)
                .title("Test Movie")
                .originalTitle("Test Original")
                .releaseDate(LocalDate.of(2023, 1, 1))
                .playTime(120)
                .build();
    }

    @Test
    void findById_WhenExists_ReturnsProductionResponseDTO() {
        when(repository.findById(1L)).thenReturn(Optional.of(production));
        when(relationalMapper.toDTO(production)).thenReturn(productionResponseDTO);

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
        List<Production> productions = Arrays.asList(production);
        Page<Production> productionPage = new PageImpl<>(productions, pageable, 1);

        when(repository.findAll(pageable)).thenReturn(productionPage);
        when(relationalMapper.toDTO(production)).thenReturn(productionResponseDTO);

        Page<ProductionResponseDTO> result = productionService.findAll(pageable);

        assertNotNull(result);
        assertEquals(1, result.getTotalElements());
        assertEquals(productionResponseDTO, result.getContent().get(0));
        verify(repository).findAll(pageable);
    }

    @Test
    void save_ReturnsProductionDTO() {
        when(mapper.toEntity(productionDTO)).thenReturn(production);
        when(repository.save(production)).thenReturn(production);
        when(mapper.toDTO(production)).thenReturn(productionDTO);

        ProductionDTO result = productionService.save(productionDTO);

        assertNotNull(result);
        assertEquals(productionDTO.getId(), result.getId());
        assertEquals(productionDTO.getTitle(), result.getTitle());
        verify(repository).save(production);
    }

    @Test
    void getTop_ReturnsListOfProductionResponseDTO() {
        Long limit = 5L;
        List<ImdbScoreResponseDTO> imdbScores = Arrays.asList(
                ImdbScoreResponseDTO.builder().productionId(1L).build()
        );
        List<Production> productions = Arrays.asList(production);
        List<ProductionResponseDTO> expectedResponse = Arrays.asList(productionResponseDTO);

        when(imdbScoreService.getTop(limit)).thenReturn(imdbScores);
        when(repository.findAllById(any())).thenReturn(productions);
        when(relationalMapper.toDTOList(productions)).thenReturn(expectedResponse);

        List<ProductionResponseDTO> result = productionService.getTop(limit);

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(productionResponseDTO, result.get(0));
        verify(imdbScoreService).getTop(limit);
    }
}