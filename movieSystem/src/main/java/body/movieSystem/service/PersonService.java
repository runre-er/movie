package body.movieSystem.service;

import body.movieSystem.dto.general.PersonDTO;
import body.movieSystem.dto.response.PersonResponseDTO;
import body.movieSystem.entity.Person;
import body.movieSystem.mapper.PersonMapper;
import body.movieSystem.repository.PersonRepository;
import jakarta.persistence.EntityNotFoundException;
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
    public PersonDTO save(PersonDTO personDTO) {
        Person person = mapper.toEntity(personDTO);
        return mapper.toDTO(repository.save(person));
    }
}
