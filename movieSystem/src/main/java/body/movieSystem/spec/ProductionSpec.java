package body.movieSystem.spec;

import body.movieSystem.entity.Production;
import net.kaczmarzyk.spring.data.jpa.domain.GreaterThanOrEqual;
import net.kaczmarzyk.spring.data.jpa.domain.LessThanOrEqual;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "title", params = "titleLike", spec = Like.class),
        @Spec(path = "originalTitle", params = "originalTitleLike", spec = Like.class),
        @Spec(path = "releaseDate", params = "startDate", spec = GreaterThanOrEqual.class),
        @Spec(path = "releaseDate", params = "endDate", spec = LessThanOrEqual.class),
        @Spec(path = "playTime", params = "minPlayTime", spec = GreaterThanOrEqual.class),
        @Spec(path = "playTime", params = "maxPlayTime", spec = LessThanOrEqual.class),
})
public interface ProductionSpec extends Specification<Production> {
}