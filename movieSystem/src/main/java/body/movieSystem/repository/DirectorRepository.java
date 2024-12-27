package body.movieSystem.repository;

import body.movieSystem.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DirectorRepository
        extends JpaRepository<Director, Long>, JpaSpecificationExecutor<Director> {

    @Query("SELECT d FROM Director d JOIN FETCH d.person JOIN FETCH d.production WHERE d.production.id = :id")
    List<Director> findByProductionId(@Param("id") Long id);
}
