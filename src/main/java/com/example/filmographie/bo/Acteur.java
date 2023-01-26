package com.example.filmographie.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Acteur extends Personne{
    @ManyToMany
    private List<Film> films;

    public Acteur(Integer id, String nom, String prenom, List<Film> films) {
        super(id, nom, prenom);
        this.films = films;
    }

    public Acteur(Integer id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public Acteur() {

    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
