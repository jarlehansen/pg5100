package no.nith.pg5100.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleInterceptor {

    @PreDestroy
    public void preDestroy() {
        System.out.println(LifeCycleInterceptor.class.getSimpleName() + " - preDestroy");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(LifeCycleInterceptor.class.getSimpleName() + " - postConstruct");
    }
}
