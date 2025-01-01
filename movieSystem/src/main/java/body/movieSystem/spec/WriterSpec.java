package body.movieSystem.spec;

import body.movieSystem.entity.Writer;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "production.id", params = "productionId", spec = Equal.class),
        @Spec(path = "person.id", params = "personId", spec = Equal.class),
        @Spec(path = "person.name", params = "personName", spec = Like.class),
        @Spec(path = "person.surname", params = "personSurname", spec = Like.class),
        @Spec(path = "person.birthDate", params = "birthDate", spec = Equal.class),
        @Spec(path = "person.birthCountry", params = "birthCountry", spec = Equal.class)
})
public interface WriterSpec extends Specification<Writer> {
}
