package body.movieSystem.service;

import body.movieSystem.dto.general.TechCrewDTO;
import body.movieSystem.dto.response.TechCrewResponseDTO;
import body.movieSystem.entity.TechCrew;
import body.movieSystem.mapper.TechCrewMapper;
import body.movieSystem.repository.TechCrewRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public List<TechCrewResponseDTO> findByProductionId(Long id) {
        return mapper.toResponseDTOList(repository.findByProductionId(id));
    }
    public List<TechCrewResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public TechCrewResponseDTO findById(Long id) {
        return repository
                .findById(id)
                .map(mapper::toResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("Actor not found with id: " + id));
    }
    public TechCrewDTO save(TechCrewDTO techCrewDTO) {
        TechCrew entity = mapper.toEntity(techCrewDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Actor not found with id: " + id);
        }
        repository.deleteById(id);
    }
    public Page<TechCrewResponseDTO> filter(Specification<TechCrew> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(mapper::toResponseDTO);
    }
}
