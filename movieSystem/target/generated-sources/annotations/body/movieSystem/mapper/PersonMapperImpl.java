package body.movieSystem.mapper;

import body.movieSystem.dto.PersonDTO;
import body.movieSystem.entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T00:30:27+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO.PersonDTOBuilder personDTO = PersonDTO.builder();

        personDTO.id( person.getId() );
        personDTO.personName( person.getPersonName() );
        personDTO.personSurname( person.getPersonSurname() );
        personDTO.birthDate( person.getBirthDate() );
        personDTO.birthCountry( person.getBirthCountry() );

        return personDTO.build();
    }

    @Override
    public Person toEntity(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( personDTO.getId() );
        person.setPersonName( personDTO.getPersonName() );
        person.setPersonSurname( personDTO.getPersonSurname() );
        person.setBirthDate( personDTO.getBirthDate() );
        person.setBirthCountry( personDTO.getBirthCountry() );

        return person;
    }

    @Override
    public List<PersonDTO> toDTOList(List<Person> persons) {
        if ( persons == null ) {
            return null;
        }

        List<PersonDTO> list = new ArrayList<PersonDTO>( persons.size() );
        for ( Person person : persons ) {
            list.add( toDTO( person ) );
        }

        return list;
    }

    @Override
    public List<Person> toEntityList(List<PersonDTO> personDTOS) {
        if ( personDTOS == null ) {
            return null;
        }

        List<Person> list = new ArrayList<Person>( personDTOS.size() );
        for ( PersonDTO personDTO : personDTOS ) {
            list.add( toEntity( personDTO ) );
        }

        return list;
    }
}
