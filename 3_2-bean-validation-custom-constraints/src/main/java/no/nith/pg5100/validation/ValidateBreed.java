package no.nith.pg5100.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = BreedValidator.class)
@Documented
// If a type declaration is annotated with Documented, its annotations become part of the public API of the annotated elements.
public @interface ValidateBreed {

    String message() default "breed is not valid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
