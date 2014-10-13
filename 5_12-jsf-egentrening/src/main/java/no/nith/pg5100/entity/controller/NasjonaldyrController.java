package no.nith.pg5100.entity.controller;

import no.nith.pg5100.entity.Nasjonaldyr;

import javax.enterprise.inject.Model;
import java.util.ArrayList;
import java.util.List;

@Model
public class NasjonaldyrController {

    public List<Nasjonaldyr> hentAlle() {
        Nasjonaldyr n1 = new Nasjonaldyr("Grevling", 14);
        Nasjonaldyr n2 = new Nasjonaldyr("Lemmen", 23);

        List<Nasjonaldyr> nasjonaldyrListe = new ArrayList<>();
        nasjonaldyrListe.add(n1);
        nasjonaldyrListe.add(n2);

        return nasjonaldyrListe;
    }

}
