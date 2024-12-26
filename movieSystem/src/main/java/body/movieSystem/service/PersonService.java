package body.movieSystem.service;

import body.movieSystem.dto.cast.PersonDTO;
import body.movieSystem.entity.Person;
import body.movieSystem.mapper.PersonMapper;
import body.movieSystem.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

  private final PersonRepository repository;
  private final PersonMapper mapper;

  public PersonDTO save(PersonDTO personDTO) {
    Person person = mapper.toEntity(personDTO);
    return mapper.toDTO(repository.save(person));
  }
}
