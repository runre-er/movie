package body.movieSystem.api.controller;

import body.movieSystem.api.dto.general.ImdbScoreDTO;
import body.movieSystem.api.dto.response.ImdbScoreResponseDTO;
import body.movieSystem.application.service.ImdbScoreService;
import body.movieSystem.application.spec.ImdbScoreSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/imdb-scores")
public class ImdbScoreController {

    private final ImdbScoreService service;

    @GetMapping
    public ResponseEntity<Page<ImdbScoreResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ImdbScoreResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<ImdbScoreDTO> save(@RequestBody ImdbScoreDTO imdbScoreDTO) {
        return ResponseEntity.ok(service.save(imdbScoreDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<ImdbScoreResponseDTO>> filter(ImdbScoreSpec spec,
                                                             Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
