package no.nith.pg5100;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Model
public class TestController {

    private String input = "";

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void validateInput() {
        FacesContext context = FacesContext.getCurrentInstance();

        if (input == null || input.length() == 0) {
            context.addMessage("validateInput:input", new FacesMessage(FacesMessage.SEVERITY_INFO, "Ikke gyldig verdi", "Lengen på verdien må være lenger enn 0"));
        } else if ("error".equals(input)) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Test feilmelding (FacesMessage.SEVERITY_ERROR)", ""));
        }
    }
}
