package no.nith.pg5100.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.Instance;

public class Main {

    public static void main(String[] args) {
        WeldContainer container = new Weld().initialize();
        Instance<MainService> mainService = container.instance().select(MainService.class);
        mainService.get().main();
    }
}
