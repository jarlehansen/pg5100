package no.nith.pg5100;

import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@RequestScoped
public class MyObject {
    @NotNull
    private final String text;

    @Min(0)
    private final int number;

    public MyObject(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
