package no.nith.pg5100;

import no.nith.pg5100.service.UserDao;

public class MyService {

    private UserDao userDao;

    public void printUsers() {
        userDao.getUsers();
    }
}
