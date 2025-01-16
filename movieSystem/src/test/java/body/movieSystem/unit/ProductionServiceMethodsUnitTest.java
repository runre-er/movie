package body.movieSystem.unit;

import body.movieSystem.api.dto.general.GenreDTO;
import body.movieSystem.api.dto.general.JobDTO;
import body.movieSystem.api.dto.general.LanguageDTO;
import body.movieSystem.api.dto.general.ProductionDTO;
import body.movieSystem.api.dto.response.*;
import body.movieSystem.application.mapper.entityMapping.ProductionMapper;
import body.movieSystem.application.mapper.relational.ProductionCastCrewMapper;
import body.movieSystem.application.mapper.relational.ProductionRelationalMapper;
import body.movieSystem.application.service.ImdbScoreService;
import body.movieSystem.application.service.ProductionService;
import body.movieSystem.application.service.TechCrewService;
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
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

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
    @Mock
    private TechCrewService techCrewService;

    private Production production;
    private ProductionDTO productionDTO;
    private ProductionResponseDTO productionResponseDTO;
    private ProductionCastCrewDTO productionCastCrewDTO;
    private ProductionInfoDTO productionInfoDTO;
    private List<TechCrewResponseDTO> techCrewResponseDTOs;
    private PersonResponseDTO personResponseDTO;
    private JobDTO jobDTO;

    @BeforeEach
    void setUp() {

        production = new Production();
        production.setId(1L);
        production.setTitle("Test Movie");
        production.setOriginalTitle("Test Original");
        production.setReleaseDate(LocalDate.of(2023, 1, 1));
        production.setPlayTime(120);

        productionDTO = ProductionDTO.builder()
                .id(1L).title("Test Movie")
                .originalTitle("Test Original")
                .releaseDate(LocalDate.of(2023, 1, 1))
                .playTime(120)
                .build();

        productionResponseDTO = ProductionResponseDTO.builder()
                .id(1L).title("Test Movie")
                .originalTitle("Test Original")
                .releaseDate(LocalDate.of(2023, 1, 1))
                .playTime(120)
                .build();

        productionCastCrewDTO = ProductionCastCrewDTO.builder()
                .actors(List.of(new ActorResponseDTO()))
                .writers(List.of(new WriterResponseDTO()))
                .directors(List.of(new DirectorResponseDTO()))
                .stars(List.of(new StarResponseDTO()))
                .build();

        productionInfoDTO = ProductionInfoDTO.builder()
                .id(1L)
                .language(new LanguageDTO())
                .genre(new GenreDTO())
                .imdbScores(List.of(new ImdbScoreResponseDTO()))
                .build();

        personResponseDTO = PersonResponseDTO.builder()
                .id(1L)
                .name("John")
                .surname("Doe")
                .birthDate(LocalDate.of(1980, 1, 1))
                .build();

        jobDTO = JobDTO.builder()
                .id(1L)
                .name("Camera Operator")
                .build();

        TechCrewResponseDTO techCrewResponseDTO = TechCrewResponseDTO.builder()
                .id(1L)
                .person(personResponseDTO)
                .job(jobDTO)
                .build();

        techCrewResponseDTOs = Arrays.asList(techCrewResponseDTO, TechCrewResponseDTO.builder()
                .id(2L)
                .person(PersonResponseDTO.builder()
                        .id(2L)
                        .name("Jane")
                        .surname("Smith")
                        .birthDate(LocalDate.of(1985, 5, 15))
                        .build())
                .job(JobDTO.builder()
                        .id(2L)
                        .name("Sound Engineer")
                        .build())
                .build());

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

        assertThrows(ResourceNotFoundException.class, () -> productionService.findById(99L));
        verify(repository).findById(99L);
    }

    @Test
    void findAll_ReturnsPageOfProductionResponseDTO() {
        Pageable pageable = PageRequest.of(0, 10);
        List<Production> productions = Collections.singletonList(production);
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
        List<ImdbScoreResponseDTO> imdbScores = Collections.singletonList(ImdbScoreResponseDTO.builder().productionId(1L).build());
        List<Production> productions = Collections.singletonList(production);
        List<ProductionResponseDTO> expectedResponse = Collections.singletonList(productionResponseDTO);

        when(imdbScoreService.getTop(limit)).thenReturn(imdbScores);
        when(repository.findAllById(any())).thenReturn(productions);
        when(relationalMapper.toDTOList(productions)).thenReturn(expectedResponse);

        List<ProductionResponseDTO> result = productionService.getTop(limit);

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(productionResponseDTO, result.get(0));
        verify(imdbScoreService).getTop(limit);
    }
    @Test
    void findCastCrewByProductionId_WhenExists_ReturnsProductionCastCrewDTO() {
        when(repository.findById(1L)).thenReturn(Optional.of(production));
        when(productionCastCrewMapper.toDTO(production)).thenReturn(productionCastCrewDTO);

        ProductionCastCrewDTO result = productionService.findCastCrewByProductionId(1L);

        assertNotNull(result);
        assertNotNull(result.getActors());
        assertNotNull(result.getWriters());
        assertNotNull(result.getDirectors());
        assertNotNull(result.getStars());
        verify(repository).findById(1L);
        verify(productionCastCrewMapper).toDTO(production);
    }

    @Test
    void findCastCrewByProductionId_WhenNotExists_ThrowsResourceNotFoundException() {
        when(repository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> productionService.findCastCrewByProductionId(99L));
        verify(repository).findById(99L);
    }

    @Test
    void findTechCrewByProductionId_ReturnsListOfTechCrewResponseDTO() {
        when(techCrewService.findByProductionId(1L)).thenReturn(techCrewResponseDTOs);

        List<TechCrewResponseDTO> result = productionService.findTechCrewByProductionId(1L);

        assertNotNull(result);
        assertEquals(2, result.size());

        TechCrewResponseDTO firstCrewMember = result.get(0);
        assertEquals(1L, firstCrewMember.getId());
        assertEquals("John", firstCrewMember.getPerson().getName());
        assertEquals("Doe", firstCrewMember.getPerson().getSurname());
        assertEquals(LocalDate.of(1980, 1, 1), firstCrewMember.getPerson().getBirthDate());
        assertEquals("Camera Operator", firstCrewMember.getJob().getName());

        TechCrewResponseDTO secondCrewMember = result.get(1);
        assertEquals(2L, secondCrewMember.getId());
        assertEquals("Jane", secondCrewMember.getPerson().getName());
        assertEquals("Smith", secondCrewMember.getPerson().getSurname());
        assertEquals(LocalDate.of(1985, 5, 15), secondCrewMember.getPerson().getBirthDate());
        assertEquals("Sound Engineer", secondCrewMember.getJob().getName());

        verify(techCrewService).findByProductionId(1L);
    }

    @Test
    void filter_ReturnsPageOfProductionResponseDTO() {
        Pageable pageable = PageRequest.of(0, 10);
        Specification<Production> spec = mock(Specification.class);
        List<Production> productions = Collections.singletonList(production);
        Page<Production> productionPage = new PageImpl<>(productions, pageable, 1);

        when(repository.findAll(spec, pageable)).thenReturn(productionPage);
        when(relationalMapper.toDTO(production)).thenReturn(productionResponseDTO);

        Page<ProductionResponseDTO> result = productionService.filter(spec, pageable);

        assertNotNull(result);
        assertEquals(1, result.getTotalElements());
        assertEquals(productionResponseDTO, result.getContent().get(0));
        verify(repository).findAll(spec, pageable);
    }

    @Test
    void getInfoByID_WhenExists_ReturnsProductionInfoDTO() {
        when(repository.findById(1L)).thenReturn(Optional.of(production));
        when(relationalMapper.toInfoDTO(production)).thenReturn(productionInfoDTO);

        ProductionInfoDTO result = productionService.getInfoByID(1L);

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
        when(repository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> productionService.getInfoByID(99L));
        verify(repository).findById(99L);
    }

}