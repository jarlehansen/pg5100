package no.nith.pg5100;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BillingServiceImplTest {
    private BillingServiceImpl billingServiceImpl;

    @Before
    public void setUp() {
        billingServiceImpl = new BillingServiceImpl();
    }

    @Test
    public void registerInvoice() {
        billingServiceImpl.registerInvoice(new Invoice(1, "test customer", "test address", new BigDecimal(0)));
        assertEquals(1, billingServiceImpl.getRegisteredInvoices().size());
    }

    @Test
    public void getTotalAmount() {
        billingServiceImpl.registerInvoice(new Invoice(1, "", "", new BigDecimal("50")));
        billingServiceImpl.registerInvoice(new Invoice(2, "", "", new BigDecimal("50")));
        assertEquals(100, billingServiceImpl.getTotalAmount().intValue());
    }
}
