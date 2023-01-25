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

}
