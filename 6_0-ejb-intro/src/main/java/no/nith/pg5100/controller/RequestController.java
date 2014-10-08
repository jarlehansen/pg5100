package no.nith.pg5100.controller;

import no.nith.pg5100.ejb.SingletonEjb;
import no.nith.pg5100.ejb.StatefulEjb;
import no.nith.pg5100.ejb.StatelessEjb;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class RequestController {
    private StatelessEjb statelessEjb;
    private StatefulEjb statefulEjb;
    private SingletonEjb singletonEjb;

    @Inject
    public void setStatelessEjb(StatelessEjb statelessEjb) {
        this.statelessEjb = statelessEjb;
    }

    @Inject
    public void setStatefulEjb(StatefulEjb statefulEjb) {
        this.statefulEjb = statefulEjb;
    }

    @Inject
    public void setSingletonEjb(SingletonEjb singletonEjb) {
        this.singletonEjb = singletonEjb;
    }

    public String stateless() {
        return statelessEjb.getText();
    }

    public String singleton() {
        return singletonEjb.getText();
    }

    public String stateful() {
        return statefulEjb.getText();
    }
}
