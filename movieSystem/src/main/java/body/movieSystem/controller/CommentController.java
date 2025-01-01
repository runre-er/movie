package body.movieSystem.controller;

import body.movieSystem.dto.general.CommentDTO;
import body.movieSystem.dto.response.CommentResponseDTO;
import body.movieSystem.service.CommentService;
import body.movieSystem.spec.CommentSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService service;

    @GetMapping
    public ResponseEntity<List<CommentResponseDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<CommentResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<CommentDTO> save(@RequestBody CommentDTO commentDTO) {
        return ResponseEntity.ok(service.save(commentDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}/production")
    public ResponseEntity<List<CommentResponseDTO>> findByProductionId(@PathVariable Long id) {
        return ResponseEntity.ok(service.findByProductionId(id));
    }
    @GetMapping("/{id}/user")
    public ResponseEntity<List<CommentResponseDTO>> findByUserId(@PathVariable Long id) {
        return ResponseEntity.ok(service.findByUserId(id));
    }
    @GetMapping("/filter")
    public ResponseEntity<Page<CommentResponseDTO>> filter(CommentSpec spec,
                                                           Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
