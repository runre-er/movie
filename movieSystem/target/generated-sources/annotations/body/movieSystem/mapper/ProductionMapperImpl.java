package body.movieSystem.mapper;

import body.movieSystem.dto.PersonDTO;
import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.entity.Actor;
import body.movieSystem.entity.Comment;
import body.movieSystem.entity.Director;
import body.movieSystem.entity.ImdbScore;
import body.movieSystem.entity.Person;
import body.movieSystem.entity.Production;
import body.movieSystem.entity.Revenue;
import body.movieSystem.entity.Star;
import body.movieSystem.entity.Writer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-23T13:33:18+0300",
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
        productionDTO.language( production.getLanguage() );
        productionDTO.genre( production.getGenre() );
        productionDTO.country( production.getCountry() );
        List<Comment> list = production.getComments();
        if ( list != null ) {
            productionDTO.comments( new ArrayList<Comment>( list ) );
        }
        List<ImdbScore> list1 = production.getImdbScores();
        if ( list1 != null ) {
            productionDTO.imdbScores( new ArrayList<ImdbScore>( list1 ) );
        }
        List<Revenue> list2 = production.getRevenues();
        if ( list2 != null ) {
            productionDTO.revenues( new ArrayList<Revenue>( list2 ) );
        }

        productionDTO.actors( toPersonDTOSet(production.getActors()) );
        productionDTO.writers( toPersonDTOSet(production.getWriters()) );
        productionDTO.directors( toPersonDTOSet(production.getDirectors()) );
        productionDTO.stars( toPersonDTOSet(production.getStars()) );

        return productionDTO.build();
    }

    @Override
    public PersonDTO toPersonDTO(Actor actor) {
        if ( actor == null ) {
            return null;
        }

        PersonDTO.PersonDTOBuilder personDTO = PersonDTO.builder();

        personDTO.id( actorPersonsId( actor ) );
        personDTO.name( actorPersonsName( actor ) );
        personDTO.surname( actorPersonsSurname( actor ) );
        personDTO.birthDate( actorPersonsBirthDate( actor ) );
        personDTO.birthCountry( actorPersonsBirthCountry( actor ) );

        return personDTO.build();
    }

    @Override
    public PersonDTO toPersonDTO(Writer writer) {
        if ( writer == null ) {
            return null;
        }

        PersonDTO.PersonDTOBuilder personDTO = PersonDTO.builder();

        personDTO.id( writerPersonsId( writer ) );
        personDTO.name( writerPersonsName( writer ) );
        personDTO.surname( writerPersonsSurname( writer ) );
        personDTO.birthDate( writerPersonsBirthDate( writer ) );
        personDTO.birthCountry( writerPersonsBirthCountry( writer ) );

        return personDTO.build();
    }

    @Override
    public PersonDTO toPersonDTO(Director director) {
        if ( director == null ) {
            return null;
        }

        PersonDTO.PersonDTOBuilder personDTO = PersonDTO.builder();

        personDTO.id( directorPersonsId( director ) );
        personDTO.name( directorPersonsName( director ) );
        personDTO.surname( directorPersonsSurname( director ) );
        personDTO.birthDate( directorPersonsBirthDate( director ) );
        personDTO.birthCountry( directorPersonsBirthCountry( director ) );

        return personDTO.build();
    }

    @Override
    public PersonDTO toPersonDTO(Star star) {
        if ( star == null ) {
            return null;
        }

        PersonDTO.PersonDTOBuilder personDTO = PersonDTO.builder();

        personDTO.id( starPersonsId( star ) );
        personDTO.name( starPersonsName( star ) );
        personDTO.surname( starPersonsSurname( star ) );
        personDTO.birthDate( starPersonsBirthDate( star ) );
        personDTO.birthCountry( starPersonsBirthCountry( star ) );

        return personDTO.build();
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
        production.setLanguage( productionDTO.getLanguage() );
        production.setGenre( productionDTO.getGenre() );
        production.setCountry( productionDTO.getCountry() );
        List<Revenue> list = productionDTO.getRevenues();
        if ( list != null ) {
            production.setRevenues( new ArrayList<Revenue>( list ) );
        }
        List<ImdbScore> list1 = productionDTO.getImdbScores();
        if ( list1 != null ) {
            production.setImdbScores( new ArrayList<ImdbScore>( list1 ) );
        }
        List<Comment> list2 = productionDTO.getComments();
        if ( list2 != null ) {
            production.setComments( new ArrayList<Comment>( list2 ) );
        }
        production.setActors( personDTOSetToActorSet( productionDTO.getActors() ) );
        production.setWriters( personDTOSetToWriterSet( productionDTO.getWriters() ) );
        production.setDirectors( personDTOSetToDirectorSet( productionDTO.getDirectors() ) );
        production.setStars( personDTOSetToStarSet( productionDTO.getStars() ) );

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

    private Long actorPersonsId(Actor actor) {
        Person persons = actor.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getId();
    }

    private String actorPersonsName(Actor actor) {
        Person persons = actor.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getName();
    }

    private String actorPersonsSurname(Actor actor) {
        Person persons = actor.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getSurname();
    }

    private LocalDate actorPersonsBirthDate(Actor actor) {
        Person persons = actor.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getBirthDate();
    }

    private String actorPersonsBirthCountry(Actor actor) {
        Person persons = actor.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getBirthCountry();
    }

    private Long writerPersonsId(Writer writer) {
        Person persons = writer.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getId();
    }

    private String writerPersonsName(Writer writer) {
        Person persons = writer.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getName();
    }

    private String writerPersonsSurname(Writer writer) {
        Person persons = writer.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getSurname();
    }

    private LocalDate writerPersonsBirthDate(Writer writer) {
        Person persons = writer.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getBirthDate();
    }

    private String writerPersonsBirthCountry(Writer writer) {
        Person persons = writer.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getBirthCountry();
    }

    private Long directorPersonsId(Director director) {
        Person persons = director.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getId();
    }

    private String directorPersonsName(Director director) {
        Person persons = director.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getName();
    }

    private String directorPersonsSurname(Director director) {
        Person persons = director.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getSurname();
    }

    private LocalDate directorPersonsBirthDate(Director director) {
        Person persons = director.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getBirthDate();
    }

    private String directorPersonsBirthCountry(Director director) {
        Person persons = director.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getBirthCountry();
    }

    private Long starPersonsId(Star star) {
        Person persons = star.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getId();
    }

    private String starPersonsName(Star star) {
        Person persons = star.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getName();
    }

    private String starPersonsSurname(Star star) {
        Person persons = star.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getSurname();
    }

    private LocalDate starPersonsBirthDate(Star star) {
        Person persons = star.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getBirthDate();
    }

    private String starPersonsBirthCountry(Star star) {
        Person persons = star.getPersons();
        if ( persons == null ) {
            return null;
        }
        return persons.getBirthCountry();
    }

    protected Actor personDTOToActor(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Actor actor = new Actor();

        actor.setId( personDTO.getId() );

        return actor;
    }

    protected Set<Actor> personDTOSetToActorSet(Set<PersonDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Actor> set1 = new LinkedHashSet<Actor>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PersonDTO personDTO : set ) {
            set1.add( personDTOToActor( personDTO ) );
        }

        return set1;
    }

    protected Writer personDTOToWriter(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Writer writer = new Writer();

        writer.setId( personDTO.getId() );

        return writer;
    }

    protected Set<Writer> personDTOSetToWriterSet(Set<PersonDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Writer> set1 = new LinkedHashSet<Writer>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PersonDTO personDTO : set ) {
            set1.add( personDTOToWriter( personDTO ) );
        }

        return set1;
    }

    protected Director personDTOToDirector(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Director director = new Director();

        director.setId( personDTO.getId() );

        return director;
    }

    protected Set<Director> personDTOSetToDirectorSet(Set<PersonDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Director> set1 = new LinkedHashSet<Director>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PersonDTO personDTO : set ) {
            set1.add( personDTOToDirector( personDTO ) );
        }

        return set1;
    }

    protected Star personDTOToStar(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Star star = new Star();

        star.setId( personDTO.getId() );

        return star;
    }

    protected Set<Star> personDTOSetToStarSet(Set<PersonDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Star> set1 = new LinkedHashSet<Star>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PersonDTO personDTO : set ) {
            set1.add( personDTOToStar( personDTO ) );
        }

        return set1;
    }
}
