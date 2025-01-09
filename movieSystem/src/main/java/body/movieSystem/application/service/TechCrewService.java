package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.TechCrewDTO;
import body.movieSystem.api.dto.response.TechCrewResponseDTO;
import body.movieSystem.application.mapper.entityMapping.TechCrewMapper;
import body.movieSystem.application.mapper.relational.TechCrewRelationalMapper;
import body.movieSystem.domain.entity.TechCrew;
import body.movieSystem.domain.repository.TechCrewRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechCrewService {

    private final TechCrewRepository repository;
    private final TechCrewMapper mapper;
    private final TechCrewRelationalMapper relationalMapper;

    public Page<TechCrewResponseDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public TechCrewResponseDTO findById(Long id) {
        return repository
                .findById(id)
                .map(relationalMapper::toDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Tech Crew", "id", id));
    }
    public TechCrewDTO save(TechCrewDTO techCrewDTO) {
        TechCrew entity = mapper.toEntity(techCrewDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Tech Crew", "id", id);
        }
        repository.deleteById(id);
    }
    public Page<TechCrewResponseDTO> filter(Specification<TechCrew> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
    public List<TechCrewResponseDTO> findByProductionId(Long id) {
        return relationalMapper.toDTOList(repository.findByProductionId(id));
    }
}
