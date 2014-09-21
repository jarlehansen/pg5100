package no.nith.pg5100;

import no.nith.pg5100.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = factory.createEntityManager();

        Person p1 = new Person();
        p1.setName("Ola Nordmann");
        entityManager.persist(p1);
        System.out.println(p1);

        Person p2 = new Person();
        p2.setName("Kari Olsen");
        entityManager.persist(p2);
        System.out.println(p2);

        entityManager.close();
        factory.close();
    }
}
