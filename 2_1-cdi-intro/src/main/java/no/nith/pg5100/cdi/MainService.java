package no.nith.pg5100.cdi;

import javax.inject.Inject;

public class MainService {

    @Inject
    private SubService subService;
    private final Sub interfaceSubService;

    @Inject
    public MainService(Sub interfaceSubService) {
        this.interfaceSubService = interfaceSubService;
    }

    public void main() {
        System.out.println("MainService");
        // Injected into the class variable
        // Using the implementation class
        subService.sub();

        // Injected into the constructor
        // Using the interface
        interfaceSubService.sub();
    }
}
