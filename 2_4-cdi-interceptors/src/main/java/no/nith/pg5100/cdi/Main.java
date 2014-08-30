package no.nith.pg5100.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class Main {

    @Inject
    public Main(TargetClassInterceptor targetClassInterceptor, ClassInterceptorImpl classInterceptor, LifeCycleInterceptor lifeCycleInterceptor) {
        targetClassInterceptor.doSomething("test");
        targetClassInterceptor.doNothing();

        classInterceptor.doSomething("test2");
        classInterceptor.doNothing();
    }

    public static void main(String[] args) {
        WeldContainer container = new Weld().initialize();
        Instance<Main> main = container.instance().select(Main.class);
        Main instance = main.get();
        main.destroy(instance);
    }
}
