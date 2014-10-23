package no.nith.pg5100.controller;

import no.nith.pg5100.ejb.StatefulEjb;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class SessionController implements Serializable {
    private StatefulEjb statefulEjb;

    @Inject
    public void setStatefulEjb(StatefulEjb statefulEjb) {
        this.statefulEjb = statefulEjb;
    }

    public String stateful() {
        return statefulEjb.getText();
    }
}
