package no.nith.pg5100.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class Main {
    private final Sender sender;
    private final Receiver receiver;

    @Inject
    public Main(Receiver receiver, Sender sender) {
        this.receiver = receiver;
        this.sender = sender;
    }

    public void sendEvent() {
        sender.send(new MyObject(1, "test event"));
    }

    public static void main(String[] args) {
        WeldContainer container = new Weld().initialize();
        Instance<Main> instance = container.instance().select(Main.class);
        instance.get().sendEvent();
    }
}
