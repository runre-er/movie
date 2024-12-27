package body.movieSystem.repository;

import body.movieSystem.entity.ImdbScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ImdbScoreRepository
        extends JpaRepository<ImdbScore, Long>, JpaSpecificationExecutor<ImdbScore> {
}
