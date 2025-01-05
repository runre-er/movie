package body.movieSystem.api.dto.validation.validator;

import body.movieSystem.api.dto.validation.annotation.SizeMessage;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SizeMessageValidator implements ConstraintValidator<SizeMessage, String> {
    private int min;
    private int max;

    @Override
    public void initialize(SizeMessage constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        int length = value.length();
        return length >= min && length <= max;
    }
}