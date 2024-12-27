package body.movieSystem.service;

import body.movieSystem.dto.GenreDTO;
import body.movieSystem.entity.Genre;
import body.movieSystem.mapper.GenreMapper;
import body.movieSystem.repository.GenreRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GenreService {

    private final GenreRepository repository;
    private final GenreMapper mapper;

    public List<GenreDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
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
