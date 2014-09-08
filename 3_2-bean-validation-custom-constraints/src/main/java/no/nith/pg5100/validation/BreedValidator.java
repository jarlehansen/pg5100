package no.nith.pg5100.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BreedValidator implements ConstraintValidator<ValidateBreed, Dog> {

    @Override
    public void initialize(ValidateBreed validateBreed) {
    }

    @Override
    public boolean isValid(Dog dog, ConstraintValidatorContext constraintValidatorContext) {
        for (Breed breed : Breed.values()) {
            if (breed.name().equals(dog.getBreed().toUpperCase()))
                return true;
        }
        return false;
    }
}
