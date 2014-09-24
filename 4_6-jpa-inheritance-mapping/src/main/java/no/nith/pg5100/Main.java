package no.nith.pg5100;

import no.nith.pg5100.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("inheritance-mapping");
        EntityManager entityManager = factory.createEntityManager();

        Book book = entityManager.find(Book.class, 1);
        System.out.println(book);

        entityManager.close();
        factory.close();
    }
}
