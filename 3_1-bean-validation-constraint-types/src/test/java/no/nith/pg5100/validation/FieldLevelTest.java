package no.nith.pg5100.validation;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FieldLevelTest extends AbstractValidationTest {

    @Test
    public void validInput() {
        FieldLevel fieldLevel = new FieldLevel();
        fieldLevel.name = "Ola Nordmann";
        fieldLevel.age = 50;

        Set<ConstraintViolation<FieldLevel>> violations = validator.validate(fieldLevel);
        assertEquals(0, violations.size());
    }

    @Test
    public void invalidInput() {
        FieldLevel fieldLevel = new FieldLevel();
        fieldLevel.name = null;
        fieldLevel.age = -1;

        Set<ConstraintViolation<FieldLevel>> violations = validator.validate(fieldLevel);
        printViolations(violations);
        assertEquals(2, violations.size());
    }
}