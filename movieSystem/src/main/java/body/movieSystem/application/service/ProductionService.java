package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.ProductionDTO;
import body.movieSystem.api.dto.response.ImdbScoreResponseDTO;
import body.movieSystem.api.dto.response.ProductionCastCrewDTO;
import body.movieSystem.api.dto.response.ProductionResponseDTO;
import body.movieSystem.api.dto.response.TechCrewResponseDTO;
import body.movieSystem.application.mapper.entityMapping.ProductionMapper;
import body.movieSystem.application.mapper.relational.ProductionCastCrewMapper;
import body.movieSystem.application.mapper.relational.ProductionRelationalMapper;
import body.movieSystem.domain.entity.Production;
import body.movieSystem.domain.repository.ProductionRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductionService {

    private final ProductionMapper mapper;
    private final ProductionRepository repository;
    private final TechCrewService techCrewService;
    private final ImdbScoreService imdbScoreService;
    private final ProductionRelationalMapper relationalMapper;
    private final ProductionCastCrewMapper productionCastCrewMapper;

    public Page<ProductionResponseDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public ProductionResponseDTO findById(Long id) {
        return relationalMapper.toDTO(
                repository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Production", "id", id)));
    }
    public ProductionCastCrewDTO findCastCrewByProductionId(Long id) {
        return productionCastCrewMapper.toDTO(
                repository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Production", "id", id)));
    }
    public List<TechCrewResponseDTO> findTechCrewByProductionId(Long id) {
        return techCrewService.findByProductionId(id);
    }
    @Valid
    public ProductionDTO save(ProductionDTO productionDTO) {
        Production production = mapper.toEntity(productionDTO);
        return mapper.toDTO(repository.save(production));
    }
    public Page<ProductionResponseDTO> filter(Specification<Production> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
    public List<ProductionResponseDTO> getTop(Long limit) {
        return relationalMapper.toDTOList(
                repository.findAllById(
                        imdbScoreService.getTop(limit).stream()
                                .map(ImdbScoreResponseDTO::getProductionId)
                                .toList()));
    }
}
