package body.movieSystem.repository;

import body.movieSystem.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository
        extends JpaRepository<Country, Long>, JpaSpecificationExecutor<Country> {
}
