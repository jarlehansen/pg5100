package no.nith.pg5100;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class PersonController {
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @PersistenceContext(unitName = "person")
    private EntityManager entityManager;

    private Person person = new Person();

    public Person getPerson() {
        return person;
    }

    @Transactional
    public void addNewPerson() {
        logger.info("Adding new person: " + person.toString());
        entityManager.persist(person);
    }

    public List<Person> getAllPersons() {
        TypedQuery<Person> query = entityManager.createNamedQuery("Person.findAll", Person.class);
        return query.getResultList();
    }
}
