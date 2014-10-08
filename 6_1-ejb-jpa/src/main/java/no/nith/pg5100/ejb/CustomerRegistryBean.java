package no.nith.pg5100.ejb;

import no.nith.pg5100.entity.Customer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class CustomerRegistryBean {
    private EntityManager entityManager;

    @PersistenceContext(unitName = "customer")
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void saveCustomer(String name) {
        Customer customer = new Customer();
        customer.setName(name);
        entityManager.persist(customer);
    }

    public List<Customer> getCustomers() {
        TypedQuery<Customer> query = entityManager.createNamedQuery("Customer.findAll", Customer.class);
        return query.getResultList();
    }
}
