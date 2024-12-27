package body.movieSystem.repository;

import body.movieSystem.entity.Star;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StarRepository extends JpaRepository<Star, Long>, JpaSpecificationExecutor<Star> {
    @Query("SELECT s FROM Star s JOIN FETCH s.person JOIN FETCH s.production WHERE s.production.id = :id")
    List<Star> findByProductionId(@Param("id") Long id);
}
