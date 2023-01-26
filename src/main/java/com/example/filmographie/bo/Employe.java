package com.example.filmographie.bo;

public class Employe extends Personne{
    private String login;
    private String password;
    private boolean isAdmin;

    public Employe(int id, String nom, String prenom, String login, String password, boolean isAdmin) {
        super(id, nom, prenom);
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }
}
