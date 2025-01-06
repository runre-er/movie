package body.movieSystem.api.controller;

import body.movieSystem.api.dto.general.WriterDTO;
import body.movieSystem.api.dto.response.WriterResponseDTO;
import body.movieSystem.application.service.WriterService;
import body.movieSystem.application.spec.WriterSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/writers")
public class WriterController {

    private final WriterService service;

    @GetMapping
    public ResponseEntity<Page<WriterResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
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
    @GetMapping("/filter")
    public ResponseEntity<Page<WriterResponseDTO>> filter(WriterSpec spec, Pageable pageable) {
        return ResponseEntity.ok(service.filter(spec, pageable));
    }
}
