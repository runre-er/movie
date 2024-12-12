package body.movieSystem.mapper;

import body.movieSystem.dto.RatingDTO;
import body.movieSystem.entity.Rating;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RatingMapper {
    RatingDTO toDTO(Rating rating);

    Rating toEntity(RatingDTO ratingDTO);

    List<RatingDTO> toDTOList(List<Rating> ratings);

    List<Rating> toEntityList(List<RatingDTO> ratingDTOS);
}
