package body.movieSystem.mapper;

import body.movieSystem.dto.general.PersonDTO;
import body.movieSystem.dto.general.ProductionDTO;
import body.movieSystem.dto.response.ActorResponseDTO;
import body.movieSystem.dto.response.DirectorResponseDTO;
import body.movieSystem.dto.response.PersonResponseDTO;
import body.movieSystem.dto.response.ProductionCrewDTO;
import body.movieSystem.dto.response.ProductionResponseDTO;
import body.movieSystem.dto.response.StarResponseDTO;
import body.movieSystem.dto.response.WriterResponseDTO;
import body.movieSystem.entity.Actor;
import body.movieSystem.entity.Director;
import body.movieSystem.entity.Person;
import body.movieSystem.entity.Production;
import body.movieSystem.entity.Star;
import body.movieSystem.entity.Writer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-29T21:34:36+0300",
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
    public ProductionResponseDTO toResponseDTO(Production production) {
        if ( production == null ) {
            return null;
        }

        ProductionResponseDTO.ProductionResponseDTOBuilder productionResponseDTO = ProductionResponseDTO.builder();

        productionResponseDTO.id( production.getId() );
        productionResponseDTO.title( production.getTitle() );
        productionResponseDTO.originalTitle( production.getOriginalTitle() );
        productionResponseDTO.releaseDate( production.getReleaseDate() );
        productionResponseDTO.playTime( production.getPlayTime() );

        return productionResponseDTO.build();
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
    public List<ProductionDTO> toDTOList(List<ProductionDTO> productionDTO) {
        if ( productionDTO == null ) {
            return null;
        }

        List<ProductionDTO> list = new ArrayList<ProductionDTO>( productionDTO.size() );
        for ( ProductionDTO productionDTO1 : productionDTO ) {
            list.add( productionDTO1 );
        }

        return list;
    }

    @Override
    public List<ProductionResponseDTO> toResponseDTOList(List<ProductionDTO> productionDTO) {
        if ( productionDTO == null ) {
            return null;
        }

        List<ProductionResponseDTO> list = new ArrayList<ProductionResponseDTO>( productionDTO.size() );
        for ( ProductionDTO productionDTO1 : productionDTO ) {
            list.add( toResponseDTO( toEntity( productionDTO1 ) ) );
        }

        return list;
    }

    @Override
    public ProductionCrewDTO toCrewDTO(Production production) {
        if ( production == null ) {
            return null;
        }

        ProductionCrewDTO.ProductionCrewDTOBuilder productionCrewDTO = ProductionCrewDTO.builder();

        productionCrewDTO.actors( actorListToActorResponseDTOList( production.getActors() ) );
        productionCrewDTO.writers( writerListToWriterResponseDTOList( production.getWriters() ) );
        productionCrewDTO.directors( directorListToDirectorResponseDTOList( production.getDirectors() ) );
        productionCrewDTO.stars( starListToStarResponseDTOList( production.getStars() ) );

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

    protected ActorResponseDTO actorToActorResponseDTO(Actor actor) {
        if ( actor == null ) {
            return null;
        }

        ActorResponseDTO.ActorResponseDTOBuilder actorResponseDTO = ActorResponseDTO.builder();

        actorResponseDTO.id( actor.getId() );
        actorResponseDTO.person( personToPersonDTO( actor.getPerson() ) );

        return actorResponseDTO.build();
    }

    protected List<ActorResponseDTO> actorListToActorResponseDTOList(List<Actor> list) {
        if ( list == null ) {
            return null;
        }

        List<ActorResponseDTO> list1 = new ArrayList<ActorResponseDTO>( list.size() );
        for ( Actor actor : list ) {
            list1.add( actorToActorResponseDTO( actor ) );
        }

        return list1;
    }

    protected PersonResponseDTO personToPersonResponseDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonResponseDTO.PersonResponseDTOBuilder personResponseDTO = PersonResponseDTO.builder();

        personResponseDTO.id( person.getId() );
        personResponseDTO.name( person.getName() );
        personResponseDTO.surname( person.getSurname() );
        personResponseDTO.birthDate( person.getBirthDate() );

        return personResponseDTO.build();
    }

    protected WriterResponseDTO writerToWriterResponseDTO(Writer writer) {
        if ( writer == null ) {
            return null;
        }

        WriterResponseDTO.WriterResponseDTOBuilder writerResponseDTO = WriterResponseDTO.builder();

        writerResponseDTO.id( writer.getId() );
        writerResponseDTO.person( personToPersonResponseDTO( writer.getPerson() ) );

        return writerResponseDTO.build();
    }

    protected List<WriterResponseDTO> writerListToWriterResponseDTOList(List<Writer> list) {
        if ( list == null ) {
            return null;
        }

        List<WriterResponseDTO> list1 = new ArrayList<WriterResponseDTO>( list.size() );
        for ( Writer writer : list ) {
            list1.add( writerToWriterResponseDTO( writer ) );
        }

        return list1;
    }

    protected DirectorResponseDTO directorToDirectorResponseDTO(Director director) {
        if ( director == null ) {
            return null;
        }

        DirectorResponseDTO.DirectorResponseDTOBuilder directorResponseDTO = DirectorResponseDTO.builder();

        directorResponseDTO.id( director.getId() );
        directorResponseDTO.person( personToPersonResponseDTO( director.getPerson() ) );

        return directorResponseDTO.build();
    }

    protected List<DirectorResponseDTO> directorListToDirectorResponseDTOList(List<Director> list) {
        if ( list == null ) {
            return null;
        }

        List<DirectorResponseDTO> list1 = new ArrayList<DirectorResponseDTO>( list.size() );
        for ( Director director : list ) {
            list1.add( directorToDirectorResponseDTO( director ) );
        }

        return list1;
    }

    protected StarResponseDTO starToStarResponseDTO(Star star) {
        if ( star == null ) {
            return null;
        }

        StarResponseDTO.StarResponseDTOBuilder starResponseDTO = StarResponseDTO.builder();

        starResponseDTO.id( star.getId() );
        starResponseDTO.person( personToPersonResponseDTO( star.getPerson() ) );

        return starResponseDTO.build();
    }

    protected List<StarResponseDTO> starListToStarResponseDTOList(List<Star> list) {
        if ( list == null ) {
            return null;
        }

        List<StarResponseDTO> list1 = new ArrayList<StarResponseDTO>( list.size() );
        for ( Star star : list ) {
            list1.add( starToStarResponseDTO( star ) );
        }

        return list1;
    }
}
