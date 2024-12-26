package body.movieSystem.controller;

import body.movieSystem.dto.cast.PersonDTO;
import body.movieSystem.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/persons")
public class PersonController {

  private final PersonService service;

  @PostMapping
  public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO personDTO) {
    return ResponseEntity.ok(service.save(personDTO));
  }
}
