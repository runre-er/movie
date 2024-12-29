package body.movieSystem.repository;

import body.movieSystem.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository
        extends JpaRepository<Actor, Long>, JpaSpecificationExecutor<Actor> {
    @Query("SELECT a FROM Actor a JOIN FETCH a.person WHERE a.production.id = :id")
    List<Actor> findByProductionId(@Param("id") Long id);

}
