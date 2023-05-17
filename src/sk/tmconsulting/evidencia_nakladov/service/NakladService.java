package sk.tmconsulting.evidencia_nakladov.service;

import sk.tmconsulting.evidencia_nakladov.model.Naklad;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class NakladService implements INakladService {
    @Override
    public void uloz(Naklad naklad) {

    }

    @Override
    public void uprav(Naklad naklad) {

    }

    @Override
    public void zmaz(Naklad naklad) {

    }

    @Override
    public void zobraz(Naklad naklad) {

    }

    @Override
    public void zobrazVsetky(ArrayList<Naklad> zoznamNakladov) {

    }

    @Override
    public double spocitajNaklady(LocalDate datumOd, LocalDate datumDo, ArrayList<Naklad> zoznamNakladov) {
        return 0;
    }

    @Override
    public void ulozDoSuboru(ArrayList<Naklad> zoznamNakladov, String nazovSuboru) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(nazovSuboru); // vytvorime subor s nazvom kniha.ser
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // vytvorime Object stream pre ukladanie objektov
        objectOutputStream.writeObject(zoznamNakladov); // zapiseme objekt
        objectOutputStream.flush(); // realne uskutocnime operaciu zapisu
        objectOutputStream.close(); // zatvorime object output stream
        fileOutputStream.close(); // zatvorime file output stream, cize subor
    }

    @Override
    public ArrayList<Naklad> otvorZoSuboru(String nazovSuboru) throws IOException, ClassNotFoundException {
         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nazovSuboru));
         ArrayList<Naklad> naklady = (ArrayList<Naklad>) objectInputStream.readObject();
         objectInputStream.close();
         return naklady;

    }
}
