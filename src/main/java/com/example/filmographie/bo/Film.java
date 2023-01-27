package com.example.filmographie.bo;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Film {
    @Id
    @GeneratedValue
    private Integer id;
    private String titre;
    private Date dateSortie;
    private int duree;
    private String image;
    private String description;
    @ManyToOne
    private Realisateur realisateur;

    @ManyToMany
    private List<Acteur> acteurs;
    @ManyToOne
    private Categorie categorie;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Film(Integer id, String titre, Date dateSortie, int duree, String description, Realisateur realisateur, List<Acteur> acteurs, Categorie categorie) {
        this.id = id;
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.duree = duree;
        this.description = description;
        this.realisateur = realisateur;
        this.acteurs = acteurs;
        this.categorie = categorie;
    }

    public Film(Integer id, String titre, Date dateSortie, int duree, String image, String description, Realisateur realisateur, List<Acteur> acteurs, Categorie categorie) {
        this.id = id;
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.duree = duree;
        this.image = image;
        this.description = description;
        this.realisateur = realisateur;
        this.acteurs = acteurs;
        this.categorie = categorie;
    }

    public Film() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }


}
