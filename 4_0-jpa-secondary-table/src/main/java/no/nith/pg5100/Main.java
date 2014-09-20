package no.nith.pg5100;

import no.nith.pg5100.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = factory.createEntityManager();
        Person person = entityManager.find(Person.class, 2);
        System.out.println(person);
        entityManager.close();
        factory.close();
    }
}
