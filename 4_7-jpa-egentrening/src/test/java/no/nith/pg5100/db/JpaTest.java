package no.nith.pg5100.db;

import no.nith.pg5100.db.entity.Account;
import no.nith.pg5100.db.entity.AccountType;
import no.nith.pg5100.db.entity.Person;
import no.nith.pg5100.db.entity.Subscription;
import org.h2.tools.Server;
import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JpaTest {
    private static Server server;

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    @BeforeClass
    public static void startDb() throws SQLException {
        server = Server.createTcpServer("-tcpAllowOthers");
        server.start();
    }

    @AfterClass
    public static void showdownDb() {
        server.shutdown();
    }

    @Before
    public void setUp() {
        factory = Persistence.createEntityManagerFactory("egentrening4");
        entityManager = factory.createEntityManager();
    }

    @After
    public void tearDown() {
        entityManager.close();
        factory.close();
    }

    @Test
    public void getAccounts() {
        Account account = entityManager.find(Account.class, 1);
        System.out.println(account);

        assertEquals(AccountType.PRIVATE, account.getAccountType());

        Subscription subscription = account.getSubscriptions().get(0);
        assertTrue(account.getSubscriptions().size() > 0);
        assertEquals("Small", subscription.getType());

        Person person = account.getPerson();
        assertEquals("James Gosling", person.getName());
    }
}
