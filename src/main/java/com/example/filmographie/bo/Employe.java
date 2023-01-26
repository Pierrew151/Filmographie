package com.example.filmographie.bo;

import jakarta.persistence.Entity;

@Entity
public class Employe extends Personne{
    private String login;
    private String password;
    private boolean isAdmin;

    public Employe(Integer id, String nom, String prenom, String login, String password, boolean isAdmin) {
        super(id, nom, prenom);
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public Employe() {
        super();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
