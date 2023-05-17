package sk.tmconsulting.evidencia_nakladov.service;

import sk.tmconsulting.evidencia_nakladov.model.Naklad;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public interface INakladService {
    void uloz(Naklad naklad);

    void uprav(Naklad naklad);

    void zmaz(Naklad naklad);

    void zobraz(Naklad naklad);

    void zobrazVsetky(ArrayList<Naklad> zoznamNakladov);

    double spocitajNaklady(LocalDate datumOd, LocalDate datumDo, ArrayList<Naklad> zoznamNakladov);

    void ulozDoSuboru(ArrayList<Naklad> zoznamNakladov, String nazovSuboru) throws IOException;

    ArrayList<Naklad> otvorZoSuboru(String nazovSuboru) throws IOException, ClassNotFoundException;


}
