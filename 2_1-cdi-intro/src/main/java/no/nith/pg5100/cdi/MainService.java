package no.nith.pg5100.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

public class MainService {

    @Inject
    private SubService subService;
    private final Sub interfaceSubService;
    private Sub setterSubService;

    @PostConstruct
    private void init() {
        System.out.println("PostConstruct");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("PreDestroy");
    }

    @Inject
    public MainService(Sub interfaceSubService) {
        this.interfaceSubService = interfaceSubService;
    }

    @Inject
    public void setSubService(Sub setterSubService) {
        this.setterSubService = setterSubService;
    }

    public void main() {
        System.out.println("MainService");
        // Using the implementation class
        System.out.println("Injected into class variable");
        subService.sub();

        // Uses interface
        System.out.println("Injected into constructor");
        interfaceSubService.sub();

        // Uses interface
        System.out.println("Injected into setter");
        setterSubService.sub();
    }
}
