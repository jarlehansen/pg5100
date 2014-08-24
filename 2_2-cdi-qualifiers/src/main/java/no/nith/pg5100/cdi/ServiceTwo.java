package no.nith.pg5100.cdi;

@CustomQualifier
public class ServiceTwo implements Service {
    @Override
    public void execute() {
        System.out.println("Second service with custom qualifier");
    }
}
