package body.movieSystem.mapper;

import body.movieSystem.dto.RatingDTO;
import body.movieSystem.entity.Rating;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T01:07:07+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class RatingMapperImpl implements RatingMapper {

    @Override
    public RatingDTO toDTO(Rating rating) {
        if ( rating == null ) {
            return null;
        }

        RatingDTO.RatingDTOBuilder ratingDTO = RatingDTO.builder();

        ratingDTO.id( rating.getId() );
        ratingDTO.productionId( rating.getProductionId() );
        ratingDTO.userId( rating.getUserId() );
        ratingDTO.userRating( rating.getUserRating() );
        ratingDTO.userComment( rating.getUserComment() );
        ratingDTO.userRatingDate( rating.getUserRatingDate() );

        return ratingDTO.build();
    }

    @Override
    public Rating toEntity(RatingDTO ratingDTO) {
        if ( ratingDTO == null ) {
            return null;
        }

        Rating rating = new Rating();

        rating.setId( ratingDTO.getId() );
        rating.setProductionId( ratingDTO.getProductionId() );
        rating.setUserId( ratingDTO.getUserId() );
        rating.setUserRating( ratingDTO.getUserRating() );
        rating.setUserComment( ratingDTO.getUserComment() );
        rating.setUserRatingDate( ratingDTO.getUserRatingDate() );

        return rating;
    }

    @Override
    public List<RatingDTO> toDTOList(List<Rating> ratings) {
        if ( ratings == null ) {
            return null;
        }

        List<RatingDTO> list = new ArrayList<RatingDTO>( ratings.size() );
        for ( Rating rating : ratings ) {
            list.add( toDTO( rating ) );
        }

        return list;
    }

    @Override
    public List<Rating> toEntityList(List<RatingDTO> ratingDTOS) {
        if ( ratingDTOS == null ) {
            return null;
        }

        List<Rating> list = new ArrayList<Rating>( ratingDTOS.size() );
        for ( RatingDTO ratingDTO : ratingDTOS ) {
            list.add( toEntity( ratingDTO ) );
        }

        return list;
    }
}
