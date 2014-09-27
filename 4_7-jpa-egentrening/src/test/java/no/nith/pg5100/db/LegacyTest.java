package no.nith.pg5100.db;

import org.h2.tools.Server;
import org.junit.*;

import java.sql.*;

public class LegacyTest {
    private static Server server;
    private Connection connection;

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
    public void setUp() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        connection = DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/./src/test/resources/egentrening-db", "", "");
    }

    @After
    public void tearDown() throws SQLException {
        connection.close();
    }

    @Test
    public void getPersons() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Person");

        System.out.println("\nPerson:");
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("ID"));
            System.out.println("NAME: " + resultSet.getString("name"));
        }
    }

    @Test
    public void getAccounts() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Account");

        System.out.println("\nAccount:");
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("ID"));
            System.out.println("TYPE: " + resultSet.getString("TYPE"));
        }
    }

    @Test
    public void getSubscriptions() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * From Subscription");

        System.out.println("\nSubscription");
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("ID"));
            System.out.println("TYPE: " + resultSet.getString("TYPE"));
        }
    }

}
