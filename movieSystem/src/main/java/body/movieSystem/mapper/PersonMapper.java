package body.movieSystem.mapper;

import body.movieSystem.dto.cast.PersonDTO;
import body.movieSystem.entity.*;
import java.util.*;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {
  PersonDTO toDTO(Person person);

  Person toEntity(PersonDTO personDTO);

  List<PersonDTO> toDTOList(List<Person> persons);

  List<Person> toEntityList(List<PersonDTO> personDTOS);
}
