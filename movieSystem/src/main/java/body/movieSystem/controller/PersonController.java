package body.movieSystem.controller;

import body.movieSystem.dto.PersonDTO;
import body.movieSystem.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonController {

  private final PersonService personService;

  @PostMapping
  public ResponseEntity<PersonDTO> savePerson(@RequestBody PersonDTO personDTO) {
    return ResponseEntity.ok(personService.savePerson(personDTO));
  }
}
