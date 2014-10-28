package no.nith.pg5100;

import javax.enterprise.inject.Model;
import java.util.ArrayList;
import java.util.List;

// http://localhost:8080/7_5-jsf-primefaces-1.0-SNAPSHOT/index.jsf
@Model
public class TestController {
    private String text;
    private String value1;
    private String value2;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public List<String> complete(String query) {
        List<String> autocomplete = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            autocomplete.add(query + i);
        }

        return autocomplete;
    }

    public void submit() {
        System.out.println("Value1: " + value1);
        System.out.println("Value2: " + value2);
        System.out.println("TestController.submit()");
    }
}
