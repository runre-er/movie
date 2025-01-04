package body.movieSystem.api.dto.validation.validator;

import body.movieSystem.api.dto.validation.annotation.NonNullId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NonNullIdValidator implements ConstraintValidator<NonNullId, Long> {

    @Override
    public void initialize(NonNullId constraintAnnotation) {

    }

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        return value > 0;
    }
}