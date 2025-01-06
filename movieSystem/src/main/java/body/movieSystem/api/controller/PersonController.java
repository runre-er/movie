package body.movieSystem.api.controller;

import body.movieSystem.api.dto.general.PersonDTO;
import body.movieSystem.api.dto.response.PersonResponseDTO;
import body.movieSystem.application.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService service;

    @GetMapping
    public ResponseEntity<Page<PersonResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<PersonResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO personDTO) {
        return ResponseEntity.ok(service.save(personDTO));
    }
}
