package body.movieSystem.dto.validation.annotation;

import body.movieSystem.dto.validation.validator.NonNullIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD}) // Anotasyonun nerelerde kullanılabileceğini belirtir (alanlar)
@Retention(RetentionPolicy.RUNTIME) // Anotasyonun çalışma zamanında erişilebilir olmasını sağlar
@Constraint(validatedBy = NonNullIdValidator.class) // Anotasyonu hangi doğrulayıcı sınıfının işleyeceğini belirtir
@Documented // Javadoc'a dahil edilmesini sağlar
public @interface NonNullId {

  String message() default "ID alanı boş olamaz ve pozitif olmalıdır"; // Varsayılan hata mesajı

  Class<?>[] groups() default {}; // Doğrulama grupları (ileri seviye kullanım için)

  Class<? extends Payload>[] payload() default {}; // Ek bilgiler taşımak için (ileri seviye kullanım için)
}
