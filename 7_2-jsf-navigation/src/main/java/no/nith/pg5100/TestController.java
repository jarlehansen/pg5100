package no.nith.pg5100;

import javax.enterprise.inject.Model;

@Model
public class TestController {

    // http://localhost:8080/7_2-jsf-navigation-1.0-SNAPSHOT/index.jsf
    public String nextPage() {
        return "page2.xhtml";
    }
}
