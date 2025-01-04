package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.WriterDTO;
import body.movieSystem.api.dto.response.WriterResponseDTO;
import body.movieSystem.domain.entity.Writer;
import body.movieSystem.application.mapper.WriterMapper;
import body.movieSystem.domain.repository.WriterRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WriterService {

    private final WriterRepository repository;
    private final WriterMapper mapper;

    public List<WriterResponseDTO> findByProductionId(Long id) {
        return mapper.toResponseDTOList(repository.findByProductionId(id));
    }
    public List<WriterResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public WriterResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("Writer not found with id: " + id));
    }
    public WriterDTO save(WriterDTO writerDTO) {
        Writer entity = mapper.toEntity(writerDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Writer not found with id: " + id);
        }
        repository.deleteById(id);
    }
    public Page<WriterResponseDTO> filter(Specification<Writer> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(mapper::toResponseDTO);
    }
}

