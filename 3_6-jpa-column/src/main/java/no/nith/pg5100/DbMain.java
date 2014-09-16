package no.nith.pg5100;

import no.nith.pg5100.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class DbMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = factory.createEntityManager();
        Person person = entityManager.find(Person.class, 1);
        System.out.println("\nObject from database: " + person);

        entityManager.close();
        factory.close();
    }
}
