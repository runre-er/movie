package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.CountryDTO;
import body.movieSystem.application.mapper.entityMapping.CountryMapper;
import body.movieSystem.domain.entity.Country;
import body.movieSystem.domain.repository.CountryRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository repository;
    private final CountryMapper mapper;

    public List<CountryDTO> findAll() {
        return mapper.toDTOList(repository.findAll());
    }
    public CountryDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Country", "id", id));
    }
    public CountryDTO save(CountryDTO countryDTO) {
        Country entity = mapper.toEntity(countryDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Country", "id", id);
        }
        repository.deleteById(id);
    }
}
