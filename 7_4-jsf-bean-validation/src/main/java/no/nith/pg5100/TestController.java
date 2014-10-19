package no.nith.pg5100;

import javax.enterprise.inject.Model;

@Model
public class TestController {
    private Person person = new Person();

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void persistPerson() {
        System.out.println("persistPerson" + person);
    }
}
