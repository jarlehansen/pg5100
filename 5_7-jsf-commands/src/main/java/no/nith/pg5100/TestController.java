package no.nith.pg5100;

import javax.enterprise.inject.Model;

@Model
public class TestController {

    // http://localhost:8080/5_7-jsf-commands-1.0-SNAPSHOT/index.faces
    public void onSubmit() {
        System.out.println("Submit button pressed");
    }
}
