package no.nith.pg5100.cdi;

import no.nith.pg5100.cdi.class_interceptor.ClassInterceptorImpl;
import no.nith.pg5100.cdi.interceptor_binding.BindingImpl;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class Main {

    @Inject
    public Main(TargetClassInterceptor targetClassInterceptor, ClassInterceptorImpl classInterceptor,
                LifeCycleInterceptor lifeCycleInterceptor, BindingImpl bindingImpl) {
        targetClassInterceptor.doSomething("test");
        targetClassInterceptor.doNothing();

        classInterceptor.doSomething("test2");
        classInterceptor.doNothing();

        bindingImpl.doSomething("test3");
    }

    public static void main(String[] args) {
        WeldContainer container = new Weld().initialize();
        Instance<Main> main = container.instance().select(Main.class);
        Main instance = main.get();
        main.destroy(instance);
    }
}
