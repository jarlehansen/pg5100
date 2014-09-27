package no.nith.pg5100;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class PersonController implements Serializable {

    // http://localhost:8080/5_0-jsf-intro-1.0-SNAPSHOT/
    public Person getPerson() {
        Person p = new Person();
        p.setName("James Gosling");
        return p;
    }
}
