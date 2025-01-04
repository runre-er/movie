package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.PersonDTO;
import body.movieSystem.api.dto.response.PersonResponseDTO;
import body.movieSystem.application.mapper.PersonMapper;
import body.movieSystem.domain.entity.Person;
import body.movieSystem.domain.repository.PersonRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;
    private final PersonMapper mapper;

    public List<PersonResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public PersonResponseDTO findById(Long id) {
        return mapper.toResponseDTO(repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("person not found with id: " + id)));
    }
    @Valid
    public PersonDTO save(PersonDTO personDTO) {
        Person person = mapper.toEntity(personDTO);
        return mapper.toDTO(repository.save(person));
    }
}
