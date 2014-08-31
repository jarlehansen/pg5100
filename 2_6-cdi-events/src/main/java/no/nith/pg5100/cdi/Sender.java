package no.nith.pg5100.cdi;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class Sender {
    private final Event<MyObject> event;

    @Inject
    public Sender(Event<MyObject> event) {
        this.event = event;
    }

    public void send(MyObject myObject) {
        System.out.println("Sending event");
        event.fire(myObject);
    }
}
