package no.nith.pg5100.validation;

import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;
import org.hibernate.validator.resourceloading.PlatformResourceBundleLocator;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ValidationTest {
    private Dog dog;

    @Before
    public void setUp() {
        dog = new Dog(null, -1, null);
    }

    @Test
    public void invalidInput() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Set<ConstraintViolation<Dog>> violations = validator.validate(dog);
        printViolations(violations);
        assertEquals(3, violations.size());
    }

    @Test
    public void invalidInput_customResourceBundle() {
        ResourceBundleMessageInterpolator resourceBundle = new ResourceBundleMessageInterpolator(new PlatformResourceBundleLocator("CustomMessages"));
        ValidatorFactory validatorFactory = Validation.byDefaultProvider().configure().messageInterpolator(resourceBundle).buildValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Set<ConstraintViolation<Dog>> violations = validator.validate(dog);
        printViolations(violations);
        assertEquals(3, violations.size());
    }

    private void printViolations(Set<ConstraintViolation<Dog>> violations) {
        for (ConstraintViolation<?> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }
}
