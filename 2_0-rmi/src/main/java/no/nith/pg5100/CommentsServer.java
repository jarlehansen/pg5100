package no.nith.pg5100;

import javax.naming.NamingException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommentsServer implements Comments {
    private final List<String> comments = new ArrayList<>();

    // http://stackoverflow.com/questions/184618/what-is-the-best-comment-in-source-code-you-have-ever-encountered
    public CommentsServer() {
        comments.add("I am not sure why this works but it fixes the problem");
        comments.add("You are not meant to understand this");
        comments.add("I'm sorry");
        comments.add("This code sucks");
        comments.add("Comment this later");
        comments.add("Abandon all hope you who needs to debug this");
        comments.add("If this comment is removed the program will blow up");
        comments.add("I'm not sure what I did");
        comments.add("TODO: Implement this function!");
        comments.add("Please work");
        comments.add("Magic. Do not touch.");
        comments.add("this is really complicated");
        comments.add("return 1; # returns 1");
        comments.add("The following code is commented out");
        comments.add("Sometimes I believe compiler ignores all my comments");
    }

    @Override
    public String randomComment() throws RemoteException {
        Random random = new Random();
        int index = random.nextInt(comments.size());
        System.out.println(index);
        return comments.get(index);
    }

    @Override
    public String comment(int index) throws RemoteException {
        int max = comments.size() - 1;
        if (index < 0 || index > max) {
            throw new IllegalArgumentException("Invalid index. The index must be between 0 and " + max);
        } else {
            return comments.get(index);
        }
    }

    // Start with system property -Djava.security.policy=src/main/resources/security.policy
    // A poliocy file specifies which permissions are available for code from various sources, and executing as various principals
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        // Protects access to system resources from untrusted downloaded code running within the Java virtual machine.
        // If an RMI program does not install a security manager,
        // RMI will not download classes (other than from the local class path) for objects received as arguments or return values of remote method invocations.
        // This restriction ensures that the operations performed by downloaded code are subject to a security policy.
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        Comments comments = new CommentsServer();
        // Exports the supplied remote object so that it can receive invocations of its remote methods from remote clients.
        // The exportObject method returns a stub for the exported remote object. Note that the type of the variable stub must be Compute, not ComputeEngine,
        // because the stub for a remote object only implements the remote interfaces that the exported remote object implements.
        Comments stub = (Comments) UnicastRemoteObject.exportObject(comments, 0);

        // API for binding (or registering) and looking up remote objects in the registry.
        Registry registry = LocateRegistry.getRegistry();
        // Remote call to the RMI registry on the local host
        registry.rebind("CommentsServer", stub);
        System.out.println("CommentsServer started!");
    }


}
