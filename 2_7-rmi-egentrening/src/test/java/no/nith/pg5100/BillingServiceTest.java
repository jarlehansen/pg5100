package no.nith.pg5100;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BillingServiceTest {
    private BillingService billingService;

    @Before
    public void setUp() {
        billingService = new BillingService();
    }

    @Test
    public void registerInvoice() {
        billingService.registerInvoice(new Invoice(1, "test customer", "test address", new BigDecimal(0)));
        assertEquals(1, billingService.getRegisteredInvoices().size());
    }

    @Test
    public void getTotalAmount() {
        billingService.registerInvoice(new Invoice(1, "", "", new BigDecimal("50")));
        billingService.registerInvoice(new Invoice(1, "", "", new BigDecimal("50")));
        assertEquals(100, billingService.getTotalAmount().intValue());
    }
}
