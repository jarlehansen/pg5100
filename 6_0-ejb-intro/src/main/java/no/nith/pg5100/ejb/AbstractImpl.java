package no.nith.pg5100.ejb;

import java.util.Date;

abstract class AbstractImpl {
    protected Date created;
    protected int counter;

    public String getText() {
        counter++;
        return String.format("Created: %s - Counter: %d", created.toString(), counter);
    }
}
