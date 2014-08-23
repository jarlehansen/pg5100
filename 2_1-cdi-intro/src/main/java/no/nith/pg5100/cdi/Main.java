package no.nith.pg5100.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.Instance;

public class Main {

    public static void main(String[] args) {
        WeldContainer container = new Weld().initialize();
        Instance<MainService> inst = container.instance().select(MainService.class);
        MainService mainService = inst.get();
        mainService.main();
        container.instance().destroy(mainService);
    }
}
