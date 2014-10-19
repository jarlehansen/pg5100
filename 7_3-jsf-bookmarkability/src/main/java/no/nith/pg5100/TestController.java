package no.nith.pg5100;

import javax.enterprise.inject.Model;

@Model
public class TestController {

    private String param;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void action() {
        System.out.println("PARAM: " + param);
    }
}
