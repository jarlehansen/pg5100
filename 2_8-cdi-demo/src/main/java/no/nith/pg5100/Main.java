package no.nith.pg5100;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.Instance;

public class Main {

    static {
        System.setProperty("org.jboss.logging.provider", "slf4j");
    }

    public static void main(String[] args) {
        WeldContainer container = new Weld().initialize();
        Instance<MyService> service = container.instance().select(MyService.class);
        service.get().printUsers();
    }
}
