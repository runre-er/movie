package body.movieSystem.controller;

import body.movieSystem.dto.RatingDTO;
import body.movieSystem.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ratings")
public class RatingController {

  private final RatingService ratingService;

  @PostMapping
  public ResponseEntity<RatingDTO> saveRating(@RequestBody RatingDTO ratingDTO) {

    return ResponseEntity.ok(ratingService.saveRating(ratingDTO));
  }
}
