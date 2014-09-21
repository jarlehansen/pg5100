package no.nith.pg5100;

import no.nith.pg5100.entity.CreditCard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("creditCard");
        EntityManager entityManager = factory.createEntityManager();

        CreditCard creditCard = entityManager.find(CreditCard.class, 1);
        System.out.println(creditCard.getCreditCardType().name());

        entityManager.close();
        factory.close();
    }
}
