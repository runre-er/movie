package body.movieSystem.service;

import body.movieSystem.dto.ProductionCrewDTO;
import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.entity.Production;
import body.movieSystem.mapper.ProductionMapper;
import body.movieSystem.repository.ProductionRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductionService {

    private final ProductionMapper mapper;
    private final ProductionRepository repository;

    public ProductionDTO save(ProductionDTO productionDTO) {
        Production production = mapper.toEntity(productionDTO);
        return mapper.toDTO(repository.save(production));
    }
    public Page<ProductionDTO> findAllPageable(
            Pageable pageable) { // todo specification arc resolver //
        return repository.findAll(pageable).map(mapper::toDTO);
    }
    @Transactional(readOnly = true)
    public ProductionDTO findById(Long id) {
        return mapper.toDTO(
                repository
                        .findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Production not found with id: " + id)));
    }
    @Transactional(readOnly = true)
    public ProductionCrewDTO findCrewById(Long id) {
        return mapper.toCrewDTO(
                repository
                        .findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Production not found with id: " + id)));
    }
}
