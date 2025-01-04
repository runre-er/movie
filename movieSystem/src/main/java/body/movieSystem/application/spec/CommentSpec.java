package body.movieSystem.application.spec;

import body.movieSystem.domain.entity.Comment;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "production.id", params = "productionId", spec = Equal.class),
        @Spec(path = "user.id", params = "userId", spec = Equal.class),
        @Spec(path = "message", params = "message", spec = Like.class)
})
public interface CommentSpec extends Specification<Comment> {
}
