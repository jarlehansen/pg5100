package no.nith.pg5100;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Comments extends Remote {
    public String randomComment() throws RemoteException;

    public String comment(int index) throws RemoteException;
}
