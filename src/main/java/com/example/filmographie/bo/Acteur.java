package com.example.filmographie.bo;

import java.util.List;

public class Acteur extends Personne{
    private List<Film> films;

    public Acteur(int id, String nom, String prenom, List<Film> films) {
        super(id, nom, prenom);
        this.films = films;
    }

    public Acteur(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }
}
