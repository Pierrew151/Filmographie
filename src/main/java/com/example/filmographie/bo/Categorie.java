package com.example.filmographie.bo;

import java.util.List;

public class Categorie {
    private int id;
    private String nom;
    private List<Film> films;

    public Categorie(int id, String nom, List<Film> films) {
        this.id = id;
        this.nom = nom;
        this.films = films;
    }

    public Categorie(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
