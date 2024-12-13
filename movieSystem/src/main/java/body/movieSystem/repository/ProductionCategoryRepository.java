package body.movieSystem.repository;

import body.movieSystem.entity.ProductionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionCategoryRepository
    extends JpaRepository<ProductionCategory, Long>, JpaSpecificationExecutor<ProductionCategory> {}
