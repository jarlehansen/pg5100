package no.nith.pg5100.cdi;

import javax.enterprise.inject.Alternative;

@Alternative
public class ServiceTwo implements Service {
    @Override
    public void execute() {
        System.out.println("ServiceTwo");
    }
}
