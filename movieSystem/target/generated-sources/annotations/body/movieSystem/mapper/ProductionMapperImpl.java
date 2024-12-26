package body.movieSystem.mapper;

import body.movieSystem.dto.ProductionCrewDTO;
import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.dto.cast.ActorDTO;
import body.movieSystem.dto.cast.DirectorDTO;
import body.movieSystem.dto.cast.PersonDTO;
import body.movieSystem.dto.cast.StarDTO;
import body.movieSystem.dto.cast.WriterDTO;
import body.movieSystem.entity.Actor;
import body.movieSystem.entity.Director;
import body.movieSystem.entity.Person;
import body.movieSystem.entity.Production;
import body.movieSystem.entity.Star;
import body.movieSystem.entity.Writer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-26T12:28:50+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class ProductionMapperImpl implements ProductionMapper {

    @Override
    public ProductionDTO toDTO(Production production) {
        if ( production == null ) {
            return null;
        }

        ProductionDTO.ProductionDTOBuilder productionDTO = ProductionDTO.builder();

        productionDTO.id( production.getId() );
        productionDTO.title( production.getTitle() );
        productionDTO.originalTitle( production.getOriginalTitle() );
        productionDTO.releaseDate( production.getReleaseDate() );
        productionDTO.playTime( production.getPlayTime() );

        return productionDTO.build();
    }

    @Override
    public Production toEntity(ProductionDTO productionDTO) {
        if ( productionDTO == null ) {
            return null;
        }

        Production production = new Production();

        production.setId( productionDTO.getId() );
        production.setTitle( productionDTO.getTitle() );
        production.setOriginalTitle( productionDTO.getOriginalTitle() );
        production.setReleaseDate( productionDTO.getReleaseDate() );
        production.setPlayTime( productionDTO.getPlayTime() );

        return production;
    }

    @Override
    public Set<ProductionDTO> toDTOSet(Set<Production> productions) {
        if ( productions == null ) {
            return null;
        }

        Set<ProductionDTO> set = new LinkedHashSet<ProductionDTO>( Math.max( (int) ( productions.size() / .75f ) + 1, 16 ) );
        for ( Production production : productions ) {
            set.add( toDTO( production ) );
        }

        return set;
    }

    @Override
    public Set<Production> toEntitySet(Set<ProductionDTO> productionDTOS) {
        if ( productionDTOS == null ) {
            return null;
        }

        Set<Production> set = new LinkedHashSet<Production>( Math.max( (int) ( productionDTOS.size() / .75f ) + 1, 16 ) );
        for ( ProductionDTO productionDTO : productionDTOS ) {
            set.add( toEntity( productionDTO ) );
        }

        return set;
    }

    @Override
    public ProductionCrewDTO toCrewDTO(Production production) {
        if ( production == null ) {
            return null;
        }

        ProductionCrewDTO.ProductionCrewDTOBuilder productionCrewDTO = ProductionCrewDTO.builder();

        productionCrewDTO.actors( actorListToActorDTOList( production.getActors() ) );
        productionCrewDTO.writers( writerListToWriterDTOList( production.getWriters() ) );
        productionCrewDTO.directors( directorListToDirectorDTOList( production.getDirectors() ) );
        productionCrewDTO.stars( starListToStarDTOList( production.getStars() ) );

        return productionCrewDTO.build();
    }

    protected PersonDTO personToPersonDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO.PersonDTOBuilder personDTO = PersonDTO.builder();

        personDTO.id( person.getId() );
        personDTO.name( person.getName() );
        personDTO.surname( person.getSurname() );
        personDTO.birthDate( person.getBirthDate() );
        personDTO.birthCountry( person.getBirthCountry() );

        return personDTO.build();
    }

    protected ActorDTO actorToActorDTO(Actor actor) {
        if ( actor == null ) {
            return null;
        }

        ActorDTO.ActorDTOBuilder actorDTO = ActorDTO.builder();

        actorDTO.id( actor.getId() );
        actorDTO.person( personToPersonDTO( actor.getPerson() ) );

        return actorDTO.build();
    }

    protected List<ActorDTO> actorListToActorDTOList(List<Actor> list) {
        if ( list == null ) {
            return null;
        }

        List<ActorDTO> list1 = new ArrayList<ActorDTO>( list.size() );
        for ( Actor actor : list ) {
            list1.add( actorToActorDTO( actor ) );
        }

        return list1;
    }

    protected WriterDTO writerToWriterDTO(Writer writer) {
        if ( writer == null ) {
            return null;
        }

        WriterDTO.WriterDTOBuilder writerDTO = WriterDTO.builder();

        writerDTO.id( writer.getId() );
        writerDTO.person( personToPersonDTO( writer.getPerson() ) );

        return writerDTO.build();
    }

    protected List<WriterDTO> writerListToWriterDTOList(List<Writer> list) {
        if ( list == null ) {
            return null;
        }

        List<WriterDTO> list1 = new ArrayList<WriterDTO>( list.size() );
        for ( Writer writer : list ) {
            list1.add( writerToWriterDTO( writer ) );
        }

        return list1;
    }

    protected DirectorDTO directorToDirectorDTO(Director director) {
        if ( director == null ) {
            return null;
        }

        DirectorDTO.DirectorDTOBuilder directorDTO = DirectorDTO.builder();

        directorDTO.id( director.getId() );
        directorDTO.person( personToPersonDTO( director.getPerson() ) );

        return directorDTO.build();
    }

    protected List<DirectorDTO> directorListToDirectorDTOList(List<Director> list) {
        if ( list == null ) {
            return null;
        }

        List<DirectorDTO> list1 = new ArrayList<DirectorDTO>( list.size() );
        for ( Director director : list ) {
            list1.add( directorToDirectorDTO( director ) );
        }

        return list1;
    }

    protected StarDTO starToStarDTO(Star star) {
        if ( star == null ) {
            return null;
        }

        StarDTO.StarDTOBuilder starDTO = StarDTO.builder();

        starDTO.id( star.getId() );
        starDTO.person( personToPersonDTO( star.getPerson() ) );

        return starDTO.build();
    }

    protected List<StarDTO> starListToStarDTOList(List<Star> list) {
        if ( list == null ) {
            return null;
        }

        List<StarDTO> list1 = new ArrayList<StarDTO>( list.size() );
        for ( Star star : list ) {
            list1.add( starToStarDTO( star ) );
        }

        return list1;
    }
}
