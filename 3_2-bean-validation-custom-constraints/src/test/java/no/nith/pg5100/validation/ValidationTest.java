package no.nith.pg5100.validation;

import no.nith.pg5100.validation.order.Order;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ValidationTest {
    private Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @Test
    public void nullInput() {
        Dog dog = new Dog(null, -1, null);
        Set<ConstraintViolation<Dog>> violations = validator.validate(dog, Order.class);
        printViolations(violations);
        assertEquals(1, violations.size());
    }

    @Test
    public void invalidBreedInput() {
        Dog dog = new Dog("poodle", 5, "white");
        Set<ConstraintViolation<Dog>> violations = validator.validate(dog, Order.class);
        printViolations(violations);
        assertEquals(1, violations.size());
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
