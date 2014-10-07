package no.nith.pg5100.ejb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Stateful
@StatefulTimeout(unit = TimeUnit.MINUTES, value = 5)
public class StatefulEjb extends AbstractImpl implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(StatefulEjb.class);

    @PostConstruct
    public void postConstruct() {
        created = new Date();
        counter = 0;
        logger.info("postConstruct");
    }
}
