package data;


import java.io.Serializable;

public class Posizione implements Serializable {
    private String nazione;
    private String citta;
    private String indirizzo;
    private double latitudine;
    private double longitudine;

    public Posizione(String nazione, String citta, String indirizzo, double lat, double lon) {
        this.nazione = nazione;
        this.citta = citta;
        this.indirizzo = indirizzo;
        this.latitudine = lat;
        this.longitudine = lon;
    }

    // Getters e Setters
}
