package no.nith.pg5100.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class Main {
    @Inject
    private Service service;

    @Inject @CustomQualifier
    private Service qualifierService;

    public void callService() {
        service.execute();
        qualifierService.execute();
    }

    public static void main(String[] args) {
        WeldContainer container = new Weld().initialize();
        Instance<Main> main = container.instance().select(Main.class);
        main.get().callService();
    }
}
