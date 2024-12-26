package body.movieSystem.controller;

import body.movieSystem.dto.ProductionCrewDTO;
import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.service.ProductionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/productions")
public class ProductionController {

  private final ProductionService service;

  @PostMapping
  public ResponseEntity<ProductionDTO> save(@RequestBody ProductionDTO productionDTO) {
    return ResponseEntity.ok(service.save(productionDTO));
  }

  @GetMapping
  public ResponseEntity<Page<ProductionDTO>> test(Pageable pageable) {
    return ResponseEntity.ok(service.findAllPageable(pageable));
  }

  @GetMapping("/{id}")
  public ProductionDTO findById(@PathVariable Long id) {
    return ResponseEntity.ok(service.findById(id)).getBody();
  }

  @GetMapping("/{id}/crew")
  public ProductionCrewDTO findCrewById(@PathVariable Long id) {
    return ResponseEntity.ok(service.findCrewById(id)).getBody();
  }

  // todo  fıltre lı olarak dene ,  arc resolver bununla alakalı ıkısını bırlestır ,arc resolver
  // ıcınde bır fonksıyon
  // todo ıkı adet degıslen alıyor , fıltre elemanı ve pageable olarak
}
//        GET    /productions                    # Tüm yapımları listele
//        GET    /productions/{id}              # Belirli bir yapımın detaylarını getir
//        POST   /productions                   # Yeni yapım oluştur
//        PUT    /productions/{id}              # Yapım bilgilerini güncelle
//        DELETE /productions/{id}              # Yapımı sil
//
//        # İlişkili kaynaklar
//        GET    /productions/{id}/actors       # Yapımın oyuncularını listele
//        GET    /productions/{id}/directors    # Yapımın yönetmenlerini listele
//        GET    /productions/{id}/writers      # Yapımın senaristlerini listele
//        GET    /productions/{id}/stars        # Yapımın yıldızlarını listele
//        GET    /productions/{id}/comments     # Yapıma ait yorumları listele
//        GET    /productions/{id}/revenues     # Yapımın gelir bilgilerini getir
//        GET    /productions/{id}/imdb-scores  # Yapımın IMDB puanlarını getir
