package no.nith.pg5100;

import javax.enterprise.inject.Model;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// http://localhost:8080/5_9-jsf-error-messages-1.0-SNAPSHOT/index.jsf
@Model
public class Person {
    @NotNull(message = "Navn må ha en verdi")
    @Size(min = 1, message = "Navn må ha en verdi")
    private String name;

    @Min(value = 1, message = "Alder må være større enn 0")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
