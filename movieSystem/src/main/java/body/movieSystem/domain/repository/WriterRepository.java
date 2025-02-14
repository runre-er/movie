package body.movieSystem.domain.repository;

import body.movieSystem.domain.entity.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WriterRepository
        extends JpaRepository<Writer, Long>, JpaSpecificationExecutor<Writer> {
    @Query("SELECT w FROM Writer w JOIN FETCH w.person WHERE w.production.id = :id")
    List<Writer> findByProductionId(@Param("id") Long id);
}
