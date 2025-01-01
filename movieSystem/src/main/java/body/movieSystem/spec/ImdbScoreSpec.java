package body.movieSystem.spec;

import body.movieSystem.entity.ImdbScore;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.GreaterThan;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "productionId", params = "productionId", spec = Equal.class),
        @Spec(path = "score", params = "score", spec = GreaterThan.class),
        @Spec(path = "votesCount", params = "votesCount", spec = GreaterThan.class)
})
public interface ImdbScoreSpec extends Specification<ImdbScore> {
}
