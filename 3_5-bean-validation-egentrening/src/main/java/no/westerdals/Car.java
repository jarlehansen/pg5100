package no.westerdals;

import no.nith.pg5100.PG5100;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@PG5100
public class Car {
    @NotNull
    private String model;

    @AssertTrue
    private boolean registered;

    @NotNull
    @Pattern(regexp = "^[A-Z]{2} [0-9]{5}$")
    private String registrationNumber;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
