package sk.tmconsulting;

import sk.tmconsulting.evidencia_nakladov.model.Kategoria;
import sk.tmconsulting.evidencia_nakladov.model.Naklad;
import sk.tmconsulting.evidencia_nakladov.service.NakladService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class EvidenciaNakladovMain {

    public static void main(String[] args) {

        Naklad naklad1 = new Naklad("Nakup potravin", 12.60, Kategoria.POTRAVINY, LocalDate.now());
        Naklad naklad2 = new Naklad("Benzin", 45.0, Kategoria.PHM, LocalDate.now());


        ArrayList<Naklad> naklady = new ArrayList<>();
        naklady.add(naklad1);
        naklady.add(naklad2);


        NakladService service = new NakladService();
        try {
            service.ulozDoSuboru(naklady, "naklady.ser");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(service.otvorZoSuboru("naklady.ser"));
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }
}
