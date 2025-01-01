package body.movieSystem.service;

import body.movieSystem.dto.general.ActorDTO;
import body.movieSystem.dto.response.ActorResponseDTO;
import body.movieSystem.entity.Actor;
import body.movieSystem.mapper.ActorMapper;
import body.movieSystem.repository.ActorRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService {

    private final ActorRepository repository;
    private final ActorMapper mapper;

    public List<ActorResponseDTO> findByProductionId(Long id) {
        return mapper.toResponseDTOList(repository.findByProductionId(id));
    }
    public List<ActorResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public ActorResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("Actor not found with id: " + id));
    }
    public ActorDTO save(ActorDTO actorDTO) {
        Actor entity = mapper.toEntity(actorDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Actor not found with id: " + id);
        }
        repository.deleteById(id);
    }
    public Page<ActorResponseDTO> filter(Specification<Actor> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(mapper::toResponseDTO);
    }
}

