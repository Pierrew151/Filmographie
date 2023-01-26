package com.example.filmographie.bo;

import java.util.List;

public class Realisateur extends Personne{
    List<Film> films;

    public Realisateur(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }


}
