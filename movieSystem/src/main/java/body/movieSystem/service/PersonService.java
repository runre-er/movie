package body.movieSystem.service;

import body.movieSystem.dto.PersonDTO;
import body.movieSystem.entity.Person;
import body.movieSystem.mapper.PersonMapper;
import body.movieSystem.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

  private final PersonRepository personRepository;
  private final PersonMapper personMapper;

  public PersonDTO savePerson(PersonDTO personDTO) {
    Person person = personMapper.toEntity(personDTO);
    return personMapper.toDTO(personRepository.save(person));
  }
}
