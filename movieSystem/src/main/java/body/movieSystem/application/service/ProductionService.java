package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.ProductionDTO;
import body.movieSystem.api.dto.response.ProductionCrewDTO;
import body.movieSystem.api.dto.response.ProductionResponseDTO;
import body.movieSystem.application.mapper.entityMapping.ProductionMapper;
import body.movieSystem.application.mapper.relational.ProductionCrewMapper;
import body.movieSystem.application.mapper.relational.ProductionRelationalMapper;
import body.movieSystem.domain.entity.Production;
import body.movieSystem.domain.repository.ProductionRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductionService {

    private final ProductionMapper mapper;
    private final ProductionRepository repository;
    private final ProductionRelationalMapper relationalMapper;
    private final ProductionCrewMapper productionCrewMapper;

    public Page<ProductionResponseDTO> findAll(Pageable pageable) { // todo specification arc resolver //
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public ProductionResponseDTO findById(Long id) {
        return relationalMapper.toDTO(
                repository
                        .findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Production not found with id: " + id)));
    }
    public ProductionCrewDTO findCrewById(Long id) {
        return productionCrewMapper.toDTO(
                repository
                        .findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Production not found with id: " + id)));
    }
    @Valid
    public ProductionDTO save(ProductionDTO productionDTO) {
        Production production = mapper.toEntity(productionDTO);
        return mapper.toDTO(repository.save(production));
    }
    public Page<ProductionResponseDTO> filter(Specification<Production> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
}
