package no.nith.pg5100;

import javax.enterprise.inject.Model;
import java.util.ArrayList;
import java.util.List;

@Model
public class TestController {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> complete(String query) {
        List<String> autocomplete = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            autocomplete.add(query + i);
        }

        return autocomplete;
    }
}
