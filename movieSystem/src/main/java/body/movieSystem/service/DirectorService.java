package body.movieSystem.service;

import body.movieSystem.dto.cast.DirectorDTO;
import body.movieSystem.entity.Director;
import body.movieSystem.mapper.DirectorMapper;
import body.movieSystem.repository.DirectorRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DirectorService {

    private final DirectorRepository repository;
    private final DirectorMapper mapper;

    public List<DirectorDTO> findByProductionId(Long id) {
        return
                repository.findByProductionId(id).stream().map(mapper::toDTO).collect(Collectors.toList());
    }
    public List<DirectorDTO> findAll() {
        return repository.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
    }
    public DirectorDTO findById(Long id) {
        return repository
                .findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Director not found with id: " + id));
    }
    public DirectorDTO save(DirectorDTO directorDTO) {
        Director entity = mapper.toEntity(directorDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Director not found with id: " + id);
        }
        repository.deleteById(id);
    }
}

// todo specification arc resolver //
