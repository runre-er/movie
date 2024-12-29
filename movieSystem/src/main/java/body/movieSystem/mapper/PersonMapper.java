package body.movieSystem.mapper;

import body.movieSystem.dto.general.PersonDTO;
import body.movieSystem.dto.response.PersonResponseDTO;
import body.movieSystem.entity.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    PersonDTO toDTO(Person person);

    PersonResponseDTO toResponseDTO(Person person);

    Person toEntity(PersonDTO personDTO);

    List<PersonDTO> toDTOList(List<Person> persons);

    List<PersonResponseDTO> toResponseDTOList(List<Person> persons);

    List<Person> toEntityList(List<PersonDTO> personDTOS);
}
