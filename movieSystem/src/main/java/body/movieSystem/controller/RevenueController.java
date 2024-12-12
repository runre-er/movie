package body.movieSystem.controller;

import body.movieSystem.dto.RevenueDTO;
import body.movieSystem.service.RevenueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productions/revenues")
public class RevenueController {

  private final RevenueService revenueService;

  @PostMapping
  public ResponseEntity<RevenueDTO> saveRevenue(@RequestBody RevenueDTO revenueDTO) {

    return ResponseEntity.ok(revenueService.saveRevenue(revenueDTO));
  }
}
