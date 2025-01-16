// unit/service/ProductionServiceCrewOperationsTest.java
package body.movieSystem.unit.service.production;

import body.movieSystem.api.dto.response.ProductionCastCrewDTO;
import body.movieSystem.api.dto.response.TechCrewResponseDTO;
import body.movieSystem.application.mapper.relational.ProductionCastCrewMapper;
import body.movieSystem.application.service.ProductionService;
import body.movieSystem.application.service.TechCrewService;
import body.movieSystem.common.job.JobDataBuilder;
import body.movieSystem.common.person.PersonDataBuilder;
import body.movieSystem.common.prouction.ProductionDataBuilder;
import body.movieSystem.common.techCrew.TechCrewDataBuilder;
import body.movieSystem.domain.entity.Production;
import body.movieSystem.domain.repository.ProductionRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductionServiceCrewOperationsTest {
    @Mock
    private ProductionRepository repository;
    @Mock
    private ProductionCastCrewMapper productionCastCrewMapper;
    @Mock
    private TechCrewService techCrewService;
    @InjectMocks
    private ProductionService productionService;

    @Test
    void findCastCrewByProductionId_WhenExists_ReturnsProductionCastCrewDTO() {
        Production production = ProductionDataBuilder.createSampleProduction();
        ProductionCastCrewDTO expectedDTO = ProductionDataBuilder.createSampleCastCrewDTO();

        when(repository.findById(1L)).thenReturn(Optional.of(production));
        when(productionCastCrewMapper.toDTO(production)).thenReturn(expectedDTO);

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

        assertThrows(ResourceNotFoundException.class, () ->
                productionService.findCastCrewByProductionId(99L)
        );
        verify(repository).findById(99L);
    }

    @Test
    void findTechCrewByProductionId_ReturnsListOfTechCrewResponseDTO() {
        List<TechCrewResponseDTO> expectedResponse = Arrays.asList(
                TechCrewDataBuilder.createSampleTechCrewResponseDTO(),
                TechCrewResponseDTO.builder()
                        .id(2L)
                        .person(PersonDataBuilder.createSamplePersonResponseDTO())
                        .job(JobDataBuilder.createSampleJobDTO())
                        .build()
        );

        when(techCrewService.findByProductionId(1L)).thenReturn(expectedResponse);

        List<TechCrewResponseDTO> result = productionService.findTechCrewByProductionId(1L);

        assertNotNull(result);
        assertEquals(2, result.size());

        TechCrewResponseDTO firstCrewMember = result.get(0);
        assertEquals(1L, firstCrewMember.getId());
        assertEquals("John", firstCrewMember.getPerson().getName());
        assertEquals("Doe", firstCrewMember.getPerson().getSurname());
        assertEquals(LocalDate.of(1980, 1, 1), firstCrewMember.getPerson().getBirthDate());

        verify(techCrewService).findByProductionId(1L);
    }
}