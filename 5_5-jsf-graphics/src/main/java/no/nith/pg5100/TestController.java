package no.nith.pg5100;

import javax.enterprise.inject.Model;

@Model
public class TestController {

    // http://localhost:8080/5_5-jsf-graphics-1.0-SNAPSHOT/index.jsf
    public String getImage() {
        return "westerdals-oslo-act.png";
    }
}
