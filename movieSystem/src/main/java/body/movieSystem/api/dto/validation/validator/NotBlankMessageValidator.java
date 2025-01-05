package body.movieSystem.api.dto.validation.validator;

import body.movieSystem.api.dto.validation.annotation.NotBlankMessage;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotBlankMessageValidator implements ConstraintValidator<NotBlankMessage, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && !value.trim().isEmpty();
    }
}