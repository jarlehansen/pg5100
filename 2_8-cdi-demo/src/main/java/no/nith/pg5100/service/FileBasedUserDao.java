package no.nith.pg5100.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileBasedUserDao {

    public List<String> getUsers() {
        try {
            System.out.println("File based");
            return Files.lines(Paths.get("src/main/resources", "users.txt")).collect(Collectors.toList());
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to open users.txt", e);
        }
    }

}
