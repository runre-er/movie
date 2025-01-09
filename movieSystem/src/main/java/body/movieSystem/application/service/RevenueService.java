package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.RevenueDTO;
import body.movieSystem.api.dto.response.RevenueResponseDTO;
import body.movieSystem.application.mapper.entityMapping.RevenueMapper;
import body.movieSystem.application.mapper.relational.RevenueRelationalMapper;
import body.movieSystem.domain.entity.Revenue;
import body.movieSystem.domain.repository.RevenueRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RevenueService {

    private final RevenueRepository repository;
    private final RevenueMapper mapper;
    private final RevenueRelationalMapper relationalMapper;

    public Page<RevenueResponseDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public RevenueResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(relationalMapper::toDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Revenue", "id", id));
    }
    public RevenueDTO save(RevenueDTO revenueDTO) {
        Revenue revenue = mapper.toEntity(revenueDTO);
        return mapper.toDTO(repository.save(revenue));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Revenue", "id", id);
        }
        repository.deleteById(id);
    }
    public List<RevenueResponseDTO> findByProductionId(Long id) {
        return relationalMapper.toDTOList(repository.findByProductionId(id));
    }
}

