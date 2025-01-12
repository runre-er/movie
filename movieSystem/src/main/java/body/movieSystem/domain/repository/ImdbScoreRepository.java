package body.movieSystem.domain.repository;

import body.movieSystem.domain.entity.ImdbScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImdbScoreRepository
        extends JpaRepository<ImdbScore, Long>, JpaSpecificationExecutor<ImdbScore> {
    @Query(value = "SELECT * FROM imdb_scores ORDER BY score DESC LIMIT :limit", nativeQuery = true)
    List<ImdbScore> findTopScores(@Param("limit") Long limit);
}
