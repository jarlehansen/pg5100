package no.nith.pg5100.validation;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Dog {
    // Field level constraints
    @NotNull
    private String breed;
    @Min(0)
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
