package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.GenreDTO;
import body.movieSystem.domain.entity.Genre;
import body.movieSystem.application.mapper.GenreMapper;
import body.movieSystem.domain.repository.GenreRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreService {

    private final GenreRepository repository;
    private final GenreMapper mapper;

    public List<GenreDTO> findAll() {
        return mapper.toDTOList(repository.findAll());
    }
    public GenreDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Genre not found with id: " + id));
    }
    public GenreDTO save(GenreDTO genreDTO) {
        Genre entity = mapper.toEntity(genreDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Genre not found with id: " + id);
        }
        repository.deleteById(id);
    }
}
