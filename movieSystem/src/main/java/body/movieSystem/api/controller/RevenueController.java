package body.movieSystem.api.controller;

import body.movieSystem.api.dto.general.RevenueDTO;
import body.movieSystem.api.dto.response.RevenueResponseDTO;
import body.movieSystem.application.service.RevenueService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/revenues")
public class RevenueController {

    private final RevenueService service;

    @GetMapping
    public ResponseEntity<Page<RevenueResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RevenueResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<RevenueDTO> save(@RequestBody @Valid RevenueDTO revenueDTO) {
        return ResponseEntity.ok(service.save(revenueDTO));
    }
    @GetMapping("/{id}/production")
    public ResponseEntity<List<RevenueResponseDTO>> findByProductionId(@PathVariable Long id) {

        return ResponseEntity.ok(service.findByProductionId(id));
    }
}
