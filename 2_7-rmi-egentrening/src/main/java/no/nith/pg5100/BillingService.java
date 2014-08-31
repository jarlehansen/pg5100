package no.nith.pg5100;

import java.math.BigDecimal;
import java.util.List;

public interface BillingService {
    public void registerInvoice(Invoice invoice);
    public List<Invoice> getRegisteredInvoices();
    public BigDecimal getTotalAmount();
}
