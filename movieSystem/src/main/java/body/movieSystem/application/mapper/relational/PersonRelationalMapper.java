package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.PersonResponseDTO;
import body.movieSystem.domain.entity.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PersonRelationalMapper {

    PersonResponseDTO toDTO(Person person);

    List<PersonResponseDTO> toDTOList(List<Person> persons);
}
