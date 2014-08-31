package no.nith.pg5100;

import java.math.BigDecimal;

public class BillingClient {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice(1, "Kunde1", "veien 1", new BigDecimal("100.50"));
        Invoice invoice2 = new Invoice(1, "Kunde2", "veien 2", new BigDecimal("99.60"));

        BillingService billingService = new BillingServiceImpl();
        billingService.registerInvoice(invoice1, invoice2);
        System.out.println(billingService.getTotalAmount());
    }
}
