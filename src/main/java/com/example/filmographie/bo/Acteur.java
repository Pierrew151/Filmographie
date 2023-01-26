package com.example.filmographie.bo;

import java.util.List;

public class Acteur extends Personne{
    private List<Film> films;

    public Acteur(Integer id, String nom, String prenom, List<Film> films) {
        super(id, nom, prenom);
        this.films = films;
    }

    public Acteur(Integer id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
