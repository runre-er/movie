package body.movieSystem.mapper;

import body.movieSystem.dto.CrewDTO;
import body.movieSystem.entity.Crew;
import body.movieSystem.entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-15T20:15:21+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class CrewMapperImpl implements CrewMapper {

    @Override
    public CrewDTO toDTO(Crew crew) {
        if ( crew == null ) {
            return null;
        }

        CrewDTO.CrewDTOBuilder crewDTO = CrewDTO.builder();

        crewDTO.id( crew.getId() );
        crewDTO.productionId( crew.getProductionId() );
        crewDTO.production( crew.getProduction() );
        crewDTO.crewMember( personToCrew( crew.getCrewMember() ) );
        crewDTO.personId( crew.getPersonId() );
        crewDTO.role( crew.getRole() );

        return crewDTO.build();
    }

    @Override
    public Crew toEntity(CrewDTO crewDTO) {
        if ( crewDTO == null ) {
            return null;
        }

        Crew crew = new Crew();

        crew.setId( crewDTO.getId() );
        crew.setProductionId( crewDTO.getProductionId() );
        crew.setProduction( crewDTO.getProduction() );
        crew.setCrewMember( crewToPerson( crewDTO.getCrewMember() ) );
        crew.setPersonId( crewDTO.getPersonId() );
        crew.setRole( crewDTO.getRole() );

        return crew;
    }

    @Override
    public List<CrewDTO> toDTOList(List<Crew> crews) {
        if ( crews == null ) {
            return null;
        }

        List<CrewDTO> list = new ArrayList<CrewDTO>( crews.size() );
        for ( Crew crew : crews ) {
            list.add( toDTO( crew ) );
        }

        return list;
    }

    @Override
    public List<Crew> toEntityList(List<CrewDTO> crewDTOS) {
        if ( crewDTOS == null ) {
            return null;
        }

        List<Crew> list = new ArrayList<Crew>( crewDTOS.size() );
        for ( CrewDTO crewDTO : crewDTOS ) {
            list.add( toEntity( crewDTO ) );
        }

        return list;
    }

    protected Crew personToCrew(Person person) {
        if ( person == null ) {
            return null;
        }

        Crew crew = new Crew();

        crew.setId( person.getId() );

        return crew;
    }

    protected Person crewToPerson(Crew crew) {
        if ( crew == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( crew.getId() );

        return person;
    }
}
