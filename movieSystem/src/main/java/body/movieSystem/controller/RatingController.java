package body.movieSystem.controller;

import body.movieSystem.dto.RatingDTO;
import body.movieSystem.service.RatingService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ratings")
public class RatingController {

  private final RatingService service;

  @PostMapping
  public ResponseEntity<RatingDTO> saveRating(@RequestBody RatingDTO ratingDTO) {

    return ResponseEntity.ok(service.saveRating(ratingDTO));
  }

  @GetMapping
  public List<String> findAllComment() {
    return service.findAllComment();
  }
}
