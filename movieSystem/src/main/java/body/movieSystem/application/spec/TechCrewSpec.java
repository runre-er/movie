package body.movieSystem.application.spec;

import body.movieSystem.domain.entity.TechCrew;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "production.id", params = "productionId", spec = Equal.class),
        @Spec(path = "role", params = "role", spec = Like.class),
        @Spec(path = "person.name", params = "personName", spec = Like.class),
        @Spec(path = "person.surname", params = "personSurname", spec = Like.class),
        @Spec(path = "person.birthDate", params = "birthDate", spec = Equal.class),
        @Spec(path = "person.birthPlace", params = "birthPlace", spec = Like.class)
})
public interface TechCrewSpec extends Specification<TechCrew> {
}
