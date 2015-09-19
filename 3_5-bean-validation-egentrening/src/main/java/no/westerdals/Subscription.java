package no.westerdals;

import no.nith.pg5100.PG5100;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@PG5100
@SubscriptionType
public class Subscription {
    @NotNull
    @Pattern(regexp = "^\\+47 [0-9]{3} [0-9]{2} [0-9]{3}$")
    private String phoneNumber;
    private String type;
    private int cost;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
