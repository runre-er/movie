package body.movieSystem.dto.validation.annotation;

import body.movieSystem.dto.validation.validator.NonNullIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NonNullIdValidator.class)
@Documented
public @interface NonNullId {

  String message() default "ID alanı boş olamaz ve pozitif olmalıdır";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
