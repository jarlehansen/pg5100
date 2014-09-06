package no.nith.pg5100.validation;

import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ValidationTest {
    // Validator is thread safe
    private Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @Test
    public void invalidInput() {
        Dog dog = new Dog(null, -1, null);
        Set<ConstraintViolation<Dog>> violations = validator.validate(dog);
        printViolations(violations);
        assertEquals(3, violations.size());
    }

    @Test
    public void validInput() {
        Dog dog = new Dog("toller", 5, "oransje");
        Set<ConstraintViolation<Dog>> violations = validator.validate(dog);
        assertEquals(0, violations.size());
    }


    private void printViolations(Set<ConstraintViolation<Dog>> violations) {
        for (ConstraintViolation<?> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }
}
