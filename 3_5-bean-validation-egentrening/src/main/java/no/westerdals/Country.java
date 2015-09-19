package no.westerdals;

import no.nith.pg5100.PG5100;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@PG5100
public class Country {
    @NotNull
    private String name;
    @NotNull
    @Size(min = 2, max = 3)
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
