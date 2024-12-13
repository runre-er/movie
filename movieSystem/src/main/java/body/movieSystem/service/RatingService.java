package body.movieSystem.service;

import body.movieSystem.dto.RatingDTO;
import body.movieSystem.entity.Rating;
import body.movieSystem.mapper.RatingMapper;
import body.movieSystem.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingService {

  private final RatingRepository ratingRepository;
  private final RatingMapper ratingMapper;

  public RatingDTO saveRating(RatingDTO ratingDTO) {
    Rating rating = ratingMapper.toEntity(ratingDTO);
    return ratingMapper.toDTO(ratingRepository.save(rating));
  }
}
