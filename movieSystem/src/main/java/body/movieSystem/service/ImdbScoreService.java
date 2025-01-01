package body.movieSystem.service;

import body.movieSystem.dto.general.ImdbScoreDTO;
import body.movieSystem.dto.response.ImdbScoreResponseDTO;
import body.movieSystem.entity.ImdbScore;
import body.movieSystem.mapper.ImdbScoreMapper;
import body.movieSystem.repository.ImdbScoreRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImdbScoreService {

    private final ImdbScoreRepository repository;
    private final ImdbScoreMapper mapper;

    public List<ImdbScoreResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public ImdbScoreResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponseDTO)
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
    public Page<ImdbScoreResponseDTO> filter(Specification<ImdbScore> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(mapper::toResponseDTO);
    }
}
