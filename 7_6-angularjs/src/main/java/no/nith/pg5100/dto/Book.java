package no.nith.pg5100.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
