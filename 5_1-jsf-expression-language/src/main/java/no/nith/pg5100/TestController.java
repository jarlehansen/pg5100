package no.nith.pg5100;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Date;

@Named
@RequestScoped
public class TestController {
    private Date time;

    public TestController() {
        time = new Date();
    }

    public String getTime() {
        return time.toString();
    }

    public String getText() {
        return "Tekst fra " + TestController.class.getSimpleName();
    }

    public String createText(String input) {
        return "Tekst fra " + input;
    }
}
