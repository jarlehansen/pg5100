package no.nith.pg5100;

import no.nith.pg5100.entity.Person;

import javax.persistence.*;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.sql.SQLException;
import java.util.Set;

public class DbMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = factory.createEntityManager();

        Person p = new Person();
        p.setId(1);
        p.setName(null); // Contains @NotNull
        p.setZip("0185");

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();


        try {
            entityManager.persist(p);
            transaction.commit();
        } catch (RollbackException e) {
            Throwable cause = e.getCause();
            if (cause instanceof ConstraintViolationException) {
                ConstraintViolationException constraintViolationException = (ConstraintViolationException) cause;
                Set<ConstraintViolation<?>> violations = constraintViolationException.getConstraintViolations();
                System.out.println(violations.iterator().next());
            }
        } finally {
            entityManager.close();
            factory.close();
        }
    }
}
