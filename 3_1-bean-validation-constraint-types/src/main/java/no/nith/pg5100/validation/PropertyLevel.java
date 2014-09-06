package no.nith.pg5100.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PropertyLevel {
    private String name;
    private int age;

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Min(0)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
