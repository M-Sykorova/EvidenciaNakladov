package sk.tmconsulting.evidencia_nakladov.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Naklad implements Serializable {
    private String nazov;
    private double cena;
    private Kategoria kategoria;
    private LocalDate datumZaznamu;

    public Naklad(String nazov, double cena, Kategoria kategoria, LocalDate datumZaznamu) {
        this.nazov = nazov;
        this.cena = cena;
        this.kategoria = kategoria;
        this.datumZaznamu = datumZaznamu;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public LocalDate getDatumZaznamu() {
        return datumZaznamu;
    }

    public void setDatumZaznamu(LocalDate datumZaznamu) {
        this.datumZaznamu = datumZaznamu;
    }

    @Override
    public String toString() {
        return "Naklad{" +
                "nazov='" + nazov + '\'' +
                ", cena=" + cena +
                ", kategoria=" + kategoria +
                ", datumZaznamu=" + datumZaznamu +
                '}';
    }
}
