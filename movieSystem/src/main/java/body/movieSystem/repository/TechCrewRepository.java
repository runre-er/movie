package body.movieSystem.repository;

import body.movieSystem.entity.TechCrew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TechCrewRepository
    extends JpaRepository<TechCrew, Long>, JpaSpecificationExecutor<TechCrew> {}
