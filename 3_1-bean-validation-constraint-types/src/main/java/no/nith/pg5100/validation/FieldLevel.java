package no.nith.pg5100.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class FieldLevel {
    @NotNull
    String name;

    @Min(0)
    int age;
}
