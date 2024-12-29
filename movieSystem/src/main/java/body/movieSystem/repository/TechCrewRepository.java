package body.movieSystem.repository;

import body.movieSystem.entity.TechCrew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechCrewRepository
        extends JpaRepository<TechCrew, Long>, JpaSpecificationExecutor<TechCrew> {
    @Query("SELECT t FROM TechCrew t JOIN FETCH t.person WHERE t.production.id = :id")
    List<TechCrew> findByProductionId(@Param("id") Long id);
}
