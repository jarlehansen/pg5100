package no.nith.pg5100;

import javax.enterprise.inject.Model;

@Model
public class TestController {

    public String nextPage() {
        return "page2.xhtml";
    }
}
