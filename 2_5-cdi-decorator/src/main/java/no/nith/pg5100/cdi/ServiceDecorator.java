package no.nith.pg5100.cdi;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class ServiceDecorator implements ServiceInterface {
    @Inject
    @Delegate
    private ServiceInterface service;


    public String getClassName() {
        String implClassName = service.getClassName();
        return ServiceDecorator.class.getSimpleName() + "\n" + implClassName;
    }

}
