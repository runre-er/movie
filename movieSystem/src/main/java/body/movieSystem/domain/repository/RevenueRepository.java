package body.movieSystem.domain.repository;

import body.movieSystem.domain.entity.Revenue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RevenueRepository extends JpaRepository<Revenue, Long>, JpaSpecificationExecutor<Revenue> {
    @Query(value = "SELECT * FROM revenues WHERE production_id = :id", nativeQuery = true)
    List<Revenue> findByProductionId(@Param("id") Long id);
}
