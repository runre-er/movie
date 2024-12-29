package body.movieSystem.service;

import body.movieSystem.dto.general.CommentDTO;
import body.movieSystem.dto.response.CommentResponseDTO;
import body.movieSystem.entity.Comment;
import body.movieSystem.mapper.CommentMapper;
import body.movieSystem.repository.CommentRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository repository;
    private final CommentMapper mapper;

    public List<CommentResponseDTO> findByProductionId(Long id) {
        return mapper.toResponseDTOList(repository.findByProductionId(id));
    }
    public List<CommentResponseDTO> findByUserId(Long id) {
        return mapper.toResponseDTOList(repository.findByUserId(id));
    }
    public List<CommentResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }
    public CommentResponseDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponseDTO)
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
