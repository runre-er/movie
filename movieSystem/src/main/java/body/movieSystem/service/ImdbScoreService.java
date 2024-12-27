package body.movieSystem.service;

import body.movieSystem.dto.ImdbScoreDTO;
import body.movieSystem.entity.ImdbScore;
import body.movieSystem.mapper.ImdbScoreMapper;
import body.movieSystem.repository.ImdbScoreRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ImdbScoreService {

    private final ImdbScoreRepository repository;
    private final ImdbScoreMapper mapper;

    public List<ImdbScoreDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
    public ImdbScoreDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("ImdbScore not found with id: " + id));
    }
    public ImdbScoreDTO save(ImdbScoreDTO imdbScoreDTO) {
        ImdbScore entity = mapper.toEntity(imdbScoreDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("ImdbScore not found with id: " + id);
        }
        repository.deleteById(id);
    }
}
