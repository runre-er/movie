package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.CommentDTO;
import body.movieSystem.api.dto.response.CommentResponseDTO;
import body.movieSystem.application.mapper.entityMapping.CommentMapper;
import body.movieSystem.application.mapper.relational.CommentRelationalMapper;
import body.movieSystem.domain.entity.Comment;
import body.movieSystem.domain.repository.CommentRepository;
import body.movieSystem.exception.unchecked.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository repository;
    private final CommentMapper mapper;
    private final CommentRelationalMapper relationalMapper;

    public Page<CommentResponseDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(relationalMapper::toDTO);
    }
    public CommentResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(relationalMapper::toDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Comment", "id", id));
    }
    public CommentDTO save(CommentDTO commentDTO) {
        Comment entity = mapper.toEntity(commentDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Comment", "id", id);
        }
        repository.deleteById(id);
    }
    public Page<CommentResponseDTO> filter(Specification<Comment> spec, Pageable pageable) {
        return repository.findAll(spec, pageable).map(relationalMapper::toDTO);
    }
    public List<CommentResponseDTO> findByProductionId(Long id) {
        return relationalMapper.toDTOList(repository.findByProductionId(id));
    }
    public List<CommentResponseDTO> findByUserId(Long id) {
        return relationalMapper.toDTOList(repository.findByUserId(id));
    }
}
