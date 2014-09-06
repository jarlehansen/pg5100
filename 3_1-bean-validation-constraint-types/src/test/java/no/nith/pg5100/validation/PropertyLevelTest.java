package no.nith.pg5100.validation;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Set;

import static org.junit.Assert.*;

public class PropertyLevelTest extends AbstractValidationTest {

    @Test
    public void validInput() {
        PropertyLevel propertyLevel = new PropertyLevel();
        propertyLevel.setName("Ola Nordmann");
        propertyLevel.setAge(50);

        Set<ConstraintViolation<PropertyLevel>> violations = validator.validate(propertyLevel);
        assertEquals(0, violations.size());
    }

    @Test
    public void invalidInput() {
        PropertyLevel propertyLevel = new PropertyLevel();
        propertyLevel.setName(null);
        propertyLevel.setAge(-1);

        Set<ConstraintViolation<PropertyLevel>> violations = validator.validate(propertyLevel);
        printViolations(violations);
        assertEquals(2, violations.size());
    }

}