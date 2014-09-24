package no.nith.pg5100.entity;

import javax.persistence.Entity;

@Entity
public class Book extends Item {
    private String isbn;
    private String publisher;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                "} " + super.toString();
    }
}
