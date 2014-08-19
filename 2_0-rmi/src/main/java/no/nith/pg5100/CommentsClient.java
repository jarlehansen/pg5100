package no.nith.pg5100;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CommentsClient {
    // Start with system property -Djava.security.policy=src/main/resources/security.policy
    public static void main(String[] args) throws RemoteException, NotBoundException {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        Registry registry = LocateRegistry.getRegistry("127.0.0.1");
        Comments comments = (Comments) registry.lookup("CommentsServer");

        System.out.println("Funny programming comments:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(comments.randomComment());
        }
    }
}
