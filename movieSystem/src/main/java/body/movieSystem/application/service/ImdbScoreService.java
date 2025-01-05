package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.ImdbScoreDTO;
import body.movieSystem.api.dto.response.ImdbScoreResponseDTO;
import body.movieSystem.application.mapper.entityMapping.ImdbScoreMapper;
import body.movieSystem.application.mapper.relational.ImdbScoreRelationalMapper;
import body.movieSystem.domain.entity.ImdbScore;
import body.movieSystem.domain.repository.ImdbScoreRepository;
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
    private final ImdbScoreRelationalMapper relationalMapper;

    public List<ImdbScoreResponseDTO> findAll() {
        return relationalMapper.toDTOList(repository.findAll());
    }
    public ImdbScoreResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(relationalMapper::toDTO)
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
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
}
