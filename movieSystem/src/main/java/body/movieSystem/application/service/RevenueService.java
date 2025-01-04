package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.RevenueDTO;
import body.movieSystem.api.dto.response.RevenueResponseDTO;
import body.movieSystem.domain.entity.Revenue;
import body.movieSystem.application.mapper.RevenueMapper;
import body.movieSystem.domain.repository.RevenueRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RevenueService {

    private final RevenueRepository repository;
    private final RevenueMapper mapper;

    public List<RevenueResponseDTO> findByProductionId(Long id) {
        return mapper.toResponseDTOList(repository.findByProductionId(id));
    }
    public List<RevenueResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public RevenueResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("Star not found with id: " + id));
    }
    public RevenueDTO save(RevenueDTO revenueDTO) {
        Revenue revenue = mapper.toEntity(revenueDTO);
        return mapper.toDTO(repository.save(revenue));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Star not found with id: " + id);
        }
        repository.deleteById(id);
    }
}

