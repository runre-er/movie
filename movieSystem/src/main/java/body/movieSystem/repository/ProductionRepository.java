package body.movieSystem.repository;

import body.movieSystem.entity.Production;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionRepository
    extends JpaRepository<Production, Long>, JpaSpecificationExecutor<Production> {
  @Query(
      """
        SELECT p FROM Production p
        LEFT JOIN FETCH p.actors a
        LEFT JOIN FETCH a.persons
        LEFT JOIN FETCH p.writers w
        LEFT JOIN FETCH w.persons
        LEFT JOIN FETCH p.directors d
        LEFT JOIN FETCH d.persons
        LEFT JOIN FETCH p.stars s
        LEFT JOIN FETCH s.persons
        WHERE p.id = :id
        """)
  Optional<Production> findByIdWithAllRelations(@Param("id") Long id);
}
