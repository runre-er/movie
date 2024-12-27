package body.movieSystem.controller;

import body.movieSystem.dto.RevenueDTO;
import body.movieSystem.service.RevenueService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/productions/revenues")
public class RevenueController {

    private final RevenueService service;

    @PostMapping
    public ResponseEntity<RevenueDTO> save(@RequestBody @Valid RevenueDTO revenueDTO) {
        return ResponseEntity.ok(service.save(revenueDTO));
    }
}
