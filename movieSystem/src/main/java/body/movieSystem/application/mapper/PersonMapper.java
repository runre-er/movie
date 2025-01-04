package body.movieSystem.application.mapper;

import body.movieSystem.api.dto.general.PersonDTO;
import body.movieSystem.api.dto.response.PersonResponseDTO;
import body.movieSystem.domain.entity.Person;
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
