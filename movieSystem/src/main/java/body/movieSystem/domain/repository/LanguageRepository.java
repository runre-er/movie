package body.movieSystem.domain.repository;

import body.movieSystem.domain.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository
        extends JpaRepository<Language, Long>, JpaSpecificationExecutor<Language> {
}
