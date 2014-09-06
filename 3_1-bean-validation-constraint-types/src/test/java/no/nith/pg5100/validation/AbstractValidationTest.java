package no.nith.pg5100.validation;

import org.junit.Before;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public abstract class AbstractValidationTest {
    protected Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    protected <E> void printViolations(Set<ConstraintViolation<E>> violations) {
        for (ConstraintViolation<E> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }
}
