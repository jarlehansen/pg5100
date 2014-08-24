package no.nith.pg5100.cdi;


public class ServiceOne implements Service {
    @Override
    public void execute() {
        System.out.println("First service with default qualifier");
    }
}
