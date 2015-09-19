package no.westerdals;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = SubscriptionValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SubscriptionType {
    String message() default "Error in type / cost";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
