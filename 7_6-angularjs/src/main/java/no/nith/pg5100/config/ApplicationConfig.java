package no.nith.pg5100.config;

import no.nith.pg5100.service.BookService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/services")
public class ApplicationConfig extends Application {
    private final Set<Class<?>> classes;

    public ApplicationConfig() {
        classes = new HashSet<>();
        classes.add(BookService.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
