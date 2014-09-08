package no.nith.pg5100.validation;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Dog {
    @NotNull(message = "breed cannot be null")
    private String breed;

    // {value} peker på "value" verdien på @Min
    // ${validatedValue} peker på input verdien
    @Min(value = 0, message = "age must be at least {value} or higher, input was ${validatedValue}")
    private int age;

    // {color} peker på verdi hentet fra ValidationMessages.properties
    @NotEmpty(message = "{color}")
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
