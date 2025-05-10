package data;

public class Cliente extends Users {
    private String nome;
    private String cognome;
    private String domicilio;
    private String dataNascita;

    public Cliente(String username, String password, String nome, String cognome, String domicilio, String dataNascita) {
        super(username, password);
        this.nome = nome;
        this.cognome = cognome;
        this.domicilio = domicilio;
        this.dataNascita = dataNascita;
    }

    // TODO: Getters e Setters
}
