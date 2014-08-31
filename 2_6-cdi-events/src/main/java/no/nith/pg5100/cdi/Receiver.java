package no.nith.pg5100.cdi;

import javax.enterprise.event.Observes;

public class Receiver {

    public void receive(@Observes MyObject myObject) {
        System.out.println("Event received: " + myObject);
    }
}
