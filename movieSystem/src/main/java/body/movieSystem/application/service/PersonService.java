package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.PersonDTO;
import body.movieSystem.api.dto.response.PersonResponseDTO;
import body.movieSystem.application.mapper.entityMapping.PersonMapper;
import body.movieSystem.application.mapper.relational.PersonRelationalMapper;
import body.movieSystem.domain.entity.Person;
import body.movieSystem.domain.repository.PersonRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;
    private final PersonMapper mapper;
    private final PersonRelationalMapper relationalMapper;

    public Page<PersonResponseDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public PersonResponseDTO findById(Long id) {
        return relationalMapper.toDTO(repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Person", "id", id)));
    }
    @Valid
    public PersonDTO save(PersonDTO personDTO) {
        Person person = mapper.toEntity(personDTO);
        return mapper.toDTO(repository.save(person));
    }
}
