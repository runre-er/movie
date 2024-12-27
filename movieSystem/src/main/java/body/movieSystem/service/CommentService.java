package body.movieSystem.service;

import body.movieSystem.dto.CommentDTO;
import body.movieSystem.entity.Comment;
import body.movieSystem.mapper.CommentMapper;
import body.movieSystem.repository.CommentRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository repository;
    private final CommentMapper mapper;

    public List<CommentDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
    public CommentDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Comment not found with id: " + id));
    }
    public CommentDTO save(CommentDTO commentDTO) {
        Comment entity = mapper.toEntity(commentDTO);
        return mapper.toDTO(repository.save(entity));
    }
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Comment not found with id: " + id);
        }
        repository.deleteById(id);
    }
}
