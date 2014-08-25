package no.nith.pg5100.cdi;

import javax.enterprise.inject.Alternative;

@Alternative
public class ServiceOne implements Service {
    @Override
    public void execute() {
        System.out.println("ServiceOne");
    }
}
