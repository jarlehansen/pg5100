package no.nith.pg5100.service;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDao implements UserDao {
    private List<String> users = new ArrayList<>();

    public InMemoryUserDao() {
        users.add("Ole");
        users.add("Kari");
        users.add("Anne");
        users.add("Per");
    }

    public List<String> getUsers() {
        System.out.println("In memory");
        return users;
    }
}
