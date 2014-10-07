package no.nith.pg5100.ejb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import java.util.Date;

@Stateless
public class StatelessEjb extends AbstractImpl {
    private static final Logger logger = LoggerFactory.getLogger(StatelessEjb.class);

    @PostConstruct
    public void postConstruct() {
        created = new Date();
        counter = 0;
        logger.info("postConstruct");
    }
}
