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
}
