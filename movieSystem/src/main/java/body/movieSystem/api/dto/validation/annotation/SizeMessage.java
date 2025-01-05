package body.movieSystem.api.dto.validation.annotation;

import body.movieSystem.api.dto.validation.validator.SizeMessageValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SizeMessageValidator.class)
@Documented
public @interface SizeMessage {
    String message() default "must be between {min} and {max} characters";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int min() default 0;

    int max() default Integer.MAX_VALUE;
}