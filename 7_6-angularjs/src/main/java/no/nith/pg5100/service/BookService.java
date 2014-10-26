package no.nith.pg5100.service;

import no.nith.pg5100.dto.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/book")
public class BookService {

    @GET
    @Produces("application/json")
    public Book getText() {
        Book b = new Book();
        b.setTitle("Beginning Java EE 7");
        return b;
    }
}
