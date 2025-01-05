package body.movieSystem.api.dto.validation.annotation;

import body.movieSystem.api.dto.validation.validator.NotBlankMessageValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotBlankMessageValidator.class)
@Documented
public @interface NotBlankMessage {
    String message() default "cannot be empty!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}