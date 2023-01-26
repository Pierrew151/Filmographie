package com.example.filmographie.service.impl;

import com.example.filmographie.bo.Acteur;
import com.example.filmographie.bo.Categorie;
import com.example.filmographie.bo.Film;
import com.example.filmographie.bo.Realisateur;
import com.example.filmographie.repositories.ActeurRepository;
import com.example.filmographie.repositories.CategorieRepository;
import com.example.filmographie.repositories.FilmRepository;
import com.example.filmographie.repositories.RealisateurRepository;
import com.example.filmographie.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class InitServiceImpl implements InitService {
    private ActeurRepository acteurRepository;
    private CategorieRepository categorieRepository;
    private RealisateurRepository realisateurRepository;
    private FilmRepository filmRepository;

    @Autowired
    public InitServiceImpl(
            ActeurRepository acteurRepository,
            CategorieRepository categorieRepository,
            RealisateurRepository realisateurRepository,
            FilmRepository filmRepository) {
        this.acteurRepository = acteurRepository;
        this.categorieRepository = categorieRepository;
        this.realisateurRepository = realisateurRepository;
        this.filmRepository = filmRepository;
    }

    @Override
    public void init() {
        List<Acteur> listActeur = new ArrayList<>();
        listActeur.add(new Acteur(1, "jean1", "jean1"));
        listActeur.add(new Acteur(2, "jean2", "jean2"));
        listActeur.add(new Acteur(3, "jean3", "jean3"));
        acteurRepository.saveAll(listActeur);

        List<Categorie> listCategorie = new ArrayList<>();
        listCategorie.add(new Categorie(1, "Action"));
        listCategorie.add(new Categorie(2, "Comédie"));
        categorieRepository.saveAll(listCategorie);

        Realisateur realisateur = new Realisateur(1, "mark", "mark");
        realisateurRepository.save(realisateur);

        Film film = new Film(1, "test", Date.valueOf("2023-01-25"), 50,"MKSJGSKG<SLKGHSLKEHGPKGEJG", realisateur, listActeur, listCategorie.get(0));
        filmRepository.save(film);

    }
}
