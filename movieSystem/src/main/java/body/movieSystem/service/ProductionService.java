package body.movieSystem.service;

import body.movieSystem.dto.general.ProductionDTO;
import body.movieSystem.dto.response.ProductionCrewDTO;
import body.movieSystem.dto.response.ProductionResponseDTO;
import body.movieSystem.entity.Production;
import body.movieSystem.mapper.ProductionMapper;
import body.movieSystem.repository.ProductionRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public Page<ProductionResponseDTO> findAll(Pageable pageable) { // todo specification arc resolver //
        return repository.findAll(pageable).map(mapper::toResponseDTO);
    }
    public Page<ProductionResponseDTO> filter(Specification<Production> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(mapper::toResponseDTO);
    }
    public ProductionResponseDTO findById(Long id) {
        return mapper.toResponseDTO(
                repository
                        .findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Production not found with id: " + id)));
    }
    public ProductionCrewDTO findCrewById(Long id) {
        return mapper.toCrewDTO(
                repository
                        .findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Production not found with id: " + id)));
    }

    public ProductionDTO save(ProductionDTO productionDTO) {
        Production production = mapper.toEntity(productionDTO);
        return mapper.toDTO(repository.save(production));
    }
}
