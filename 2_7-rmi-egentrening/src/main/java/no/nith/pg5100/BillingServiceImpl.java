package no.nith.pg5100;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BillingServiceImpl implements BillingService {
    private final List<Invoice> registeredInvoices = new ArrayList<>();

    public void registerInvoice(Invoice... invoices) {
        for (Invoice invoice : invoices) {
            registeredInvoices.add(invoice);
            System.out.println("Invoice registered: " + invoice);
        }
    }

    public List<Invoice> getRegisteredInvoices() {
        return registeredInvoices;
    }

    public BigDecimal getTotalAmount() {
        BigDecimal amount = new BigDecimal(0);
        for (Invoice invoice : registeredInvoices) {
            amount = amount.add(invoice.getAmount());
        }

        return amount;
    }

    // Ved remote kall, start klassen med: -Djava.security.policy=src/main/resources/security.policy
    public static void main(String[] args) {
        // Server impl
    }
}
