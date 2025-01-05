package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.ActorDTO;
import body.movieSystem.api.dto.response.ActorResponseDTO;
import body.movieSystem.application.mapper.entityMapping.ActorMapper;
import body.movieSystem.application.mapper.relational.ActorRelationalMapper;
import body.movieSystem.domain.entity.Actor;
import body.movieSystem.domain.repository.ActorRepository;
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
    private final ActorRelationalMapper relationalMapper;

    public List<ActorResponseDTO> findByProductionId(Long id) {
        return relationalMapper.toDTOList(repository.findByProductionId(id));
    }
    public List<ActorResponseDTO> findAll() {
        return relationalMapper.toDTOList(repository.findAll());
    }
    public ActorResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(relationalMapper::toDTO)
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
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
}

