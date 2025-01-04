package body.movieSystem.api.dto.validation.validator;

import body.movieSystem.api.dto.validation.annotation.NotBlankCustom;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotBlankValidator implements ConstraintValidator<NotBlankCustom, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.trim().isEmpty()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("{fieldName} cannot be empty")
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
