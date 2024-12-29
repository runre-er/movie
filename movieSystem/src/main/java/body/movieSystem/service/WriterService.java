package body.movieSystem.service;

import body.movieSystem.dto.general.WriterDTO;
import body.movieSystem.dto.response.WriterResponseDTO;
import body.movieSystem.entity.Writer;
import body.movieSystem.mapper.WriterMapper;
import body.movieSystem.repository.WriterRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
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
}

// todo specification arc resolver //
