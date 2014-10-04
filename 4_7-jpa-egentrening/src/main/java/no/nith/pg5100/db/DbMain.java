package no.nith.pg5100.db;

import org.h2.tools.Server;

import java.sql.SQLException;

public class DbMain {
    public static void main(String[] args) throws SQLException {
        Server server = Server.createTcpServer("-tcpAllowOthers");
        server.start();
        System.out.println(server.getStatus());
    }
}
