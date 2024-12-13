package body.movieSystem.repository;

import body.movieSystem.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository
    extends JpaRepository<Rating, Long>, JpaSpecificationExecutor<Rating> {}
