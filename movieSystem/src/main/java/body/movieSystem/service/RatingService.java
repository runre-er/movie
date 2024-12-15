package body.movieSystem.service;

import body.movieSystem.dto.RatingDTO;
import body.movieSystem.entity.Rating;
import body.movieSystem.mapper.RatingMapper;
import body.movieSystem.repository.RatingRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingService {

  private final RatingRepository repository;
  private final RatingMapper mapper;

  public RatingDTO saveRating(RatingDTO ratingDTO) {
    Rating rating = mapper.toEntity(ratingDTO);
    return mapper.toDTO(repository.save(rating));
  }

  public List<String> findAllComment() {
    List<Rating> ratings = repository.findAll();
      return ratings.stream()
              .map(Rating::getUserComment)
              .collect(Collectors.toList());
  }
}
