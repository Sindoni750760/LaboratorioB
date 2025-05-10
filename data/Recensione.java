package data;

package data;

import java.io.Serializable;

public class Recensione implements Serializable {
    private Cliente autore;
    private String testo;
    private int stelle; // 1-5
    private String risposta; // risposta del ristoratore (opzionale)

    public Recensione(Cliente autore, String testo, int stelle) {
        this.autore = autore;
        this.testo = testo;
        this.stelle = stelle;
        this.risposta = null;
    }

    // Getters e Setters
}
