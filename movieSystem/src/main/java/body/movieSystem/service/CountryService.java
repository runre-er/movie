package body.movieSystem.service;

import body.movieSystem.dto.CountryDTO;
import body.movieSystem.entity.Country;
import body.movieSystem.mapper.CountryMapper;
import body.movieSystem.repository.CountryRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryService {

  private final CountryRepository repository;
  private final CountryMapper mapper;

  public List<CountryDTO> findAll() {
    return repository.findAll()
            .stream()
            .map(mapper::toDTO)
            .collect(Collectors.toList());
  }

  public CountryDTO findById(Long id) {
    return repository.findById(id)
            .map(mapper::toDTO)
            .orElseThrow(() -> new EntityNotFoundException("Country not found with id: " + id));
  }

  public CountryDTO save(CountryDTO countryDTO) {
    Country entity = mapper.toEntity(countryDTO);
    return mapper.toDTO(repository.save(entity));
  }

  public void delete(Long id) {
    if (!repository.existsById(id)) {
      throw new EntityNotFoundException("Country not found with id: " + id);
    }
    repository.deleteById(id);
  }
}
