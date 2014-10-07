package no.nith.pg5100.ejb;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.util.Date;

@Singleton
public class SingletonEjb extends AbstractImpl {
    private static final Logger logger = LoggerFactory.getLogger(SingletonEjb.class);

    @PostConstruct
    public void postConstruct() {
        created = new Date();
        counter = 0;
        logger.info("postConstruct");
    }
}
