package com.example.filmographie.bo;

import java.util.List;

public class Realisateur extends Personne{
    List<Film> films;

    public Realisateur(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
