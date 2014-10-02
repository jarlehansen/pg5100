package no.nith.pg5100;

import javax.enterprise.inject.Model;

@Model
public class TestController {

    public String getImage() {
        return "westerdals-oslo-act.png";
    }
}
