package body.movieSystem.dto.validation.validator;

import body.movieSystem.dto.validation.annotation.NonNullId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NonNullIdValidator implements ConstraintValidator<NonNullId, Long> {

    @Override
    public void initialize(NonNullId constraintAnnotation) {
        // Gerekirse başlatma işlemleri burada yapılabilir (genellikle boş bırakılır)
    }

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return false; // ID null ise doğrulama başarısız
        }
        return value > 0; // ID pozitif değilse doğrulama başarısız
    }
}