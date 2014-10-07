package no.nith.pg5100.controller;

import no.nith.pg5100.ejb.SingletonEjb;
import no.nith.pg5100.ejb.StatefulEjb;
import no.nith.pg5100.ejb.StatelessEjb;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class RequestController {
    private StatelessEjb statelessEjb;
    private SingletonEjb singletonEjb;

    @Inject
    public void setStatelessEjb(StatelessEjb statelessEjb) {
        this.statelessEjb = statelessEjb;
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
}
