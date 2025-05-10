package data;

public class Ristoratore extends Users {
    private String nome;
    private String cognome;
    private String domicilio;

    public Ristoratore(String username, String password, String nome, String cognome, String domicilio) {
        super(username, password);
        this.nome = nome;
        this.cognome = cognome;
        this.domicilio = domicilio;
    }

    // Getters e Setters
}
