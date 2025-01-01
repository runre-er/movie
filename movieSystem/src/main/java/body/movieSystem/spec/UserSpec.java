package body.movieSystem.spec;

import body.movieSystem.entity.User;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "id", params = "id", spec = Equal.class),
        @Spec(path = "name", params = "name", spec = Like.class),
        @Spec(path = "surName", params = "surName", spec = Like.class),
        @Spec(path = "nick", params = "nick", spec = Like.class),
        @Spec(path = "email", params = "email", spec = Like.class),
        @Spec(path = "registrationTime", params = "registrationTime", spec = Equal.class)
})
public interface UserSpec extends Specification<User> {
}
