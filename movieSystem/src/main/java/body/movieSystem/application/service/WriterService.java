package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.WriterDTO;
import body.movieSystem.api.dto.response.WriterResponseDTO;
import body.movieSystem.application.mapper.entityMapping.WriterMapper;
import body.movieSystem.application.mapper.relational.WriterRelationalMapper;
import body.movieSystem.domain.entity.Writer;
import body.movieSystem.domain.repository.PersonRepository;
import body.movieSystem.domain.repository.ProductionRepository;
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

    private final WriterMapper mapper;
    private final WriterRepository repository;
    private final PersonRepository personRepository;
    private final WriterRelationalMapper relationalMapper;
    private final ProductionRepository productionRepository;

    public Page<WriterResponseDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public WriterResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(relationalMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Writer not found with id: " + id));
    }
    public WriterDTO save(WriterDTO writerDTO) {
        Writer entity = mapper.toEntity(writerDTO);
        if (writerDTO.getProduction_id() != null) {
            entity.setProduction(productionRepository.findById(writerDTO.getProduction_id())
                    .orElseThrow(() -> new EntityNotFoundException("Production not found")));
        }

        if (writerDTO.getPerson_id() != null) {
            entity.setPerson(personRepository.findById(writerDTO.getPerson_id())
                    .orElseThrow(() -> new EntityNotFoundException("Person not found")));
        }
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Writer not found with id: " + id);
        }
        repository.deleteById(id);
    }
    public Page<WriterResponseDTO> filter(Specification<Writer> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
    public List<WriterResponseDTO> findByProductionId(Long id) {
        return relationalMapper.toDTOList(repository.findByProductionId(id));
    }
}

