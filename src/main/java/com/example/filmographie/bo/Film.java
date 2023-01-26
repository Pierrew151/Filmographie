package com.example.filmographie.bo;

import java.sql.Date;
import java.util.List;

public class Film {
    private int id;
    private String titre;
    private Date dateSortie;
    private int duree;
    private String description;
    private Realisateur realisateur;
    private List<Acteur> acteurs;
    private Categorie categorie;

    public Film(int id, String titre, Date dateSortie, int duree, String description, Realisateur realisateur, List<Acteur> acteurs, Categorie categorie) {
        this.id = id;
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.duree = duree;
        this.description = description;
        this.realisateur = realisateur;
        this.acteurs = acteurs;
        this.categorie = categorie;
    }
}
