package no.nith.pg5100.validation;

import no.nith.pg5100.validation.order.First;
import no.nith.pg5100.validation.order.Second;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@ValidateBreed(groups = Second.class)
public class Dog {

    @NotNull(groups = First.class)
    private String breed;

    @Min(value = 0)
    private int age;

    @NotEmpty
    private String color;

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
