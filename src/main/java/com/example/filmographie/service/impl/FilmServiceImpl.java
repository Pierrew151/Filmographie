package com.example.filmographie.service.impl;

import com.example.filmographie.bo.Acteur;
import com.example.filmographie.bo.Categorie;
import com.example.filmographie.bo.Film;
import com.example.filmographie.bo.Realisateur;
import com.example.filmographie.service.FilmService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FilmServiceImpl implements FilmService {

    private List<Film> listFilm;
    private Map<Integer, Film> mapFilm;

    public FilmServiceImpl() {
        listFilm = new ArrayList<>();

        Realisateur realisateur = new Realisateur(1, "mark", "mark");
        Realisateur realisateur2 = new Realisateur(2, "mark2", "mark2");
        Acteur acteur1 = new Acteur(1, "jean", "jean");
        Acteur acteur2 = new Acteur(2, "jean1", "jean1");
        Acteur acteur3 = new Acteur(3, "jean2", "jean2");
        List<Acteur> acteurList = new ArrayList<>();
        acteurList.add(acteur1);
        acteurList.add(acteur2);
        acteurList.add(acteur3);


        List<Acteur> acteurList2 = new ArrayList<>();
        acteurList2.add(acteur2);
        acteurList2.add(acteur3);

        Categorie categorie = new Categorie(1, "test");
        Categorie categorie2 = new Categorie(2, "testCateg");

        Film film = new Film(1, "test", Date.valueOf("2023-01-25"), 50,"MKSJGSKG<SLKGHSLKEHGPKGEJG", realisateur, acteurList, categorie);
        Film film2 = new Film(2, "test2", Date.valueOf("2053-01-25"), 500,"MKSJGSKG<46464565", realisateur2, acteurList2, categorie2);

        listFilm.add(film);
        listFilm.add(film2);

        mapFilm = new HashMap<>();
        listFilm.forEach(m -> mapFilm.put(m.getId(), m));
    }

    @Override
    public List<Film> getListFilm() {
        return listFilm;
    }

    @Override
    public Map<Integer, Film> getMapFilm() {
        return mapFilm;
    }
}
