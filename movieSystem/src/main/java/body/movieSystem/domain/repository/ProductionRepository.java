package body.movieSystem.domain.repository;

import body.movieSystem.domain.entity.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionRepository
        extends JpaRepository<Production, Long>, JpaSpecificationExecutor<Production> {
}
