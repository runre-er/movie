package body.movieSystem.mapper;

import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.entity.Actor;
import body.movieSystem.entity.Comment;
import body.movieSystem.entity.Director;
import body.movieSystem.entity.ImdbScore;
import body.movieSystem.entity.Production;
import body.movieSystem.entity.Revenue;
import body.movieSystem.entity.Star;
import body.movieSystem.entity.Writer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-20T20:11:53+0300",
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
        productionDTO.languageId( production.getLanguageId() );
        productionDTO.country( production.getCountry() );
        productionDTO.genreId( production.getGenreId() );
        List<Comment> list = production.getComments();
        if ( list != null ) {
            productionDTO.comments( new ArrayList<Comment>( list ) );
        }
        List<Director> list1 = production.getDirectors();
        if ( list1 != null ) {
            productionDTO.directors( new ArrayList<Director>( list1 ) );
        }
        List<Actor> list2 = production.getProd_actors();
        if ( list2 != null ) {
            productionDTO.prod_actors( new ArrayList<Actor>( list2 ) );
        }
        List<Writer> list3 = production.getWriters();
        if ( list3 != null ) {
            productionDTO.writers( new ArrayList<Writer>( list3 ) );
        }
        List<Star> list4 = production.getStars();
        if ( list4 != null ) {
            productionDTO.stars( new ArrayList<Star>( list4 ) );
        }
        List<ImdbScore> list5 = production.getImdbScores();
        if ( list5 != null ) {
            productionDTO.imdbScores( new ArrayList<ImdbScore>( list5 ) );
        }
        List<Revenue> list6 = production.getRevenues();
        if ( list6 != null ) {
            productionDTO.revenues( new ArrayList<Revenue>( list6 ) );
        }

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
        production.setLanguageId( productionDTO.getLanguageId() );
        production.setGenreId( productionDTO.getGenreId() );
        production.setCountry( productionDTO.getCountry() );
        List<Revenue> list = productionDTO.getRevenues();
        if ( list != null ) {
            production.setRevenues( new ArrayList<Revenue>( list ) );
        }
        List<ImdbScore> list1 = productionDTO.getImdbScores();
        if ( list1 != null ) {
            production.setImdbScores( new ArrayList<ImdbScore>( list1 ) );
        }
        List<Star> list2 = productionDTO.getStars();
        if ( list2 != null ) {
            production.setStars( new ArrayList<Star>( list2 ) );
        }
        List<Writer> list3 = productionDTO.getWriters();
        if ( list3 != null ) {
            production.setWriters( new ArrayList<Writer>( list3 ) );
        }
        List<Director> list4 = productionDTO.getDirectors();
        if ( list4 != null ) {
            production.setDirectors( new ArrayList<Director>( list4 ) );
        }
        List<Comment> list5 = productionDTO.getComments();
        if ( list5 != null ) {
            production.setComments( new ArrayList<Comment>( list5 ) );
        }
        List<Actor> list6 = productionDTO.getProd_actors();
        if ( list6 != null ) {
            production.setProd_actors( new ArrayList<Actor>( list6 ) );
        }

        return production;
    }

    @Override
    public List<ProductionDTO> toDTOList(List<Production> productions) {
        if ( productions == null ) {
            return null;
        }

        List<ProductionDTO> list = new ArrayList<ProductionDTO>( productions.size() );
        for ( Production production : productions ) {
            list.add( toDTO( production ) );
        }

        return list;
    }

    @Override
    public List<Production> toEntityList(List<ProductionDTO> productionDTOS) {
        if ( productionDTOS == null ) {
            return null;
        }

        List<Production> list = new ArrayList<Production>( productionDTOS.size() );
        for ( ProductionDTO productionDTO : productionDTOS ) {
            list.add( toEntity( productionDTO ) );
        }

        return list;
    }
}
