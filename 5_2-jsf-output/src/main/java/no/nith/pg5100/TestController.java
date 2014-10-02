package no.nith.pg5100;

import javax.enterprise.inject.Model;

@Model
public class TestController {

    // http://localhost:8080/5_2-jsf-output-1.0-SNAPSHOT/index.jsf
    public String getFirstText() {
        return "TestController.getFirstText()";
    }

    public String getSecondText() {
        return "TestController.getSecondText()";
    }

}
