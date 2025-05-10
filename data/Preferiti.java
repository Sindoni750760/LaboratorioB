package data;

import java.io.Serializable;
import java.util.HashSet;

public class Preferiti implements Serializable {
    private Cliente cliente;
    private HashSet<Ristorante> preferiti = new HashSet<>();

    public Preferiti(Cliente cliente) {
        this.cliente = cliente;
    }

    // addRistorante, removeRistorante, getLista, ecc.
}
