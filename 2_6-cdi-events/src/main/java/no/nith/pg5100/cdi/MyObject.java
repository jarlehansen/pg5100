package no.nith.pg5100.cdi;

public class MyObject {
    private final int id;
    private final String text;

    public MyObject(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
