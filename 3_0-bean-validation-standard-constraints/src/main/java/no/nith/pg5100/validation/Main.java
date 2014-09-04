package no.nith.pg5100.validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(null, 0, null);

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Dog>> violations = validator.validate(dog);

        for (ConstraintViolation<Dog> violation : violations) {
            System.out.println(violation.toString());
        }
    }
}
