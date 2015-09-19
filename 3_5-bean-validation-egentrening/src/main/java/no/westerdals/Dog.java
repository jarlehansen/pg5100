package no.westerdals;


import no.nith.pg5100.PG5100;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@PG5100
public class Dog {
    @NotNull
    private String breed;
    @NotNull
    private String color;
    @Min(5)
    private int age;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
