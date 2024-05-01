package com.example.ex2salutojson;

public class User {

    private final String nome;

    private final String provincia;

    private final String message;

    public User(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.message = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }

    public String getNome() {
        return nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getMessage() {
        return message;
    }
}
