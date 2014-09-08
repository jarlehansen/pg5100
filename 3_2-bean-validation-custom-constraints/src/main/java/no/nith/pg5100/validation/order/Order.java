package no.nith.pg5100.validation.order;

import javax.validation.GroupSequence;

@GroupSequence({First.class, Second.class})
public interface Order {
}
