package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.LanguageDTO;
import body.movieSystem.application.mapper.entityMapping.LanguageMapper;
import body.movieSystem.domain.entity.Language;
import body.movieSystem.domain.repository.LanguageRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LanguageService {

    private final LanguageRepository repository;
    private final LanguageMapper mapper;

    public List<LanguageDTO> findAll() {
        return mapper.toDTOList(repository.findAll());
    }
    public LanguageDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Language not found with id: " + id));
    }
    public LanguageDTO save(LanguageDTO languageDTO) {
        Language entity = mapper.toEntity(languageDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Language not found with id: " + id);
        }
        repository.deleteById(id);
    }
}
