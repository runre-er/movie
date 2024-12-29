package body.movieSystem.repository;

import body.movieSystem.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository
        extends JpaRepository<Comment, Long>, JpaSpecificationExecutor<Comment> {

    @Query("SELECT c FROM Comment c JOIN FETCH c.user WHERE c.production.id = :id")
    List<Comment> findByProductionId(@Param("id") Long id);

    @Query("SELECT c FROM Comment c JOIN FETCH c.user WHERE c.user.id = :id")
    List<Comment> findByUserId(@Param("id") Long id);
}
