package body.movieSystem.service;

import body.movieSystem.dto.cast.WriterDTO;
import body.movieSystem.entity.Writer;
import body.movieSystem.mapper.WriterMapper;
import body.movieSystem.repository.WriterRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WriterService {

    private final WriterRepository repository;
    private final WriterMapper mapper;

    public List<WriterDTO> findByProductionId(Long id) {
        return
                repository.findByProductionId(id).stream().map(mapper::toDTO).collect(Collectors.toList());
    }
    public List<WriterDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
    public WriterDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
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
