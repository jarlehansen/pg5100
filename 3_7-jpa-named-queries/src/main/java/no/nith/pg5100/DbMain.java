package no.nith.pg5100;

import no.nith.pg5100.entity.Person;

import javax.persistence.*;
import java.sql.SQLException;
import java.util.List;

public class DbMain {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public DbMain() {
        factory = Persistence.createEntityManagerFactory("person");
        entityManager = factory.createEntityManager();
    }

    // Named query
    private void jpqlExample1() {
        TypedQuery<Person> query = entityManager.createNamedQuery("jpqlExample1", Person.class);
        List<Person> results = query.getResultList();
        System.out.println("\nNAMED QUERY 1: ");
        for (Person person : results) {
            System.out.println(person);
        }
    }

    // Named query with parameter
    private void jpqlExample2() {
        TypedQuery<Person> query = entityManager.createNamedQuery("jpqlExample2", Person.class);
        query.setParameter("name", "Kari%");
        List<Person> results = query.getResultList();
        System.out.println("\nNAMED QUERY 2: ");
        for (Person person : results) {
            System.out.println(person);
        }
    }

    // Native query
    private void nativeExample() {
        TypedQuery<Person> query = entityManager.createNamedQuery("nativeQuery", Person.class);
        query.setParameter(1, "0185");
        List list = query.getResultList();
        System.out.println("\nNATIVE QUERY: " + list.get(0));
    }

    // Create new Person and persist it to the database
    private void persistObject() {
        Person p = new Person();
        p.setId(6);
        p.setName("Jan Johansen");
        p.setZip("2000");
        p.setAge(40);

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(p);
        transaction.commit();

        TypedQuery<Person> query = entityManager.createQuery("SELECT p FROM Person p WHERE p.id = 6", Person.class);
        System.out.println("\nPERSISTED OBJET: " + query.getResultList().get(0));
    }

    private void close() {
        entityManager.close();
        factory.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DbMain main = new DbMain();
        main.jpqlExample1();
        main.jpqlExample2();
        main.nativeExample();
        main.persistObject();
        main.close();
    }

}
