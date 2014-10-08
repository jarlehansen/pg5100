package no.nith.pg5100.controller;

import no.nith.pg5100.ejb.CustomerRegistryBean;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.List;

@Model
public class CustomerController {
    private CustomerRegistryBean customerRegistry;
    private String name;

    @Inject
    public void setCustomerRegistry(CustomerRegistryBean customerRegistry) {
        this.customerRegistry = customerRegistry;
    }

    public void save(String name) {
        customerRegistry.saveCustomer(name);
    }

    public List<no.nith.pg5100.entity.Customer> get() {
        return customerRegistry.getCustomers();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
