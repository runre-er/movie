package body.movieSystem.controller;

import body.movieSystem.dto.general.WriterDTO;
import body.movieSystem.dto.response.WriterResponseDTO;
import body.movieSystem.service.WriterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/writers")
public class WriterController {

    private final WriterService service;

    @GetMapping
    public ResponseEntity<List<WriterResponseDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<WriterResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<WriterDTO> save(@RequestBody WriterDTO writerDTO) {
        return ResponseEntity.ok(service.save(writerDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}/production")
    public ResponseEntity<List<WriterResponseDTO>> findByProductionId(@PathVariable Long id) {
        return ResponseEntity.ok(service.findByProductionId(id));
    }
}
