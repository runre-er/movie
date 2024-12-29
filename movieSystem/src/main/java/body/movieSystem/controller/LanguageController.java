package body.movieSystem.controller;

import body.movieSystem.dto.general.LanguageDTO;
import body.movieSystem.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/languages")
public class LanguageController {

    private final LanguageService service;

    @GetMapping
    public ResponseEntity<List<LanguageDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<LanguageDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<LanguageDTO> save(@RequestBody LanguageDTO languageDTO) {
        return ResponseEntity.ok(service.save(languageDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
