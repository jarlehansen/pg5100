package no.nith.pg5100.entity;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private CreditCardType creditCardType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", creditCardType=" + creditCardType +
                '}';
    }
}
