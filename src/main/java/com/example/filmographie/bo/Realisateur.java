package com.example.filmographie.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Realisateur extends Personne {
    @OneToMany
    private List<Film> films;

    public Realisateur(Integer id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public Realisateur() {

    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
