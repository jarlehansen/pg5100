package no.nith.pg5100;

import no.nith.pg5100.entity.Person;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Named
@Stateless
public class TestEjb {

    @PersistenceContext(name = "person")
    private EntityManager entityManager;

    public List<Person> getAllPersons() {
        TypedQuery<Person> query = entityManager.createNamedQuery("Person.findAll", Person.class);
        return query.getResultList();
    }
}
