package com.example.filmographie.service.impl;

import com.example.filmographie.bo.Acteur;
import com.example.filmographie.bo.Categorie;
import com.example.filmographie.service.ActeurService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ActeurServiceImpl implements ActeurService {
    private List<Acteur> listActeur;
    private Map<Integer, Acteur> mapActeur;

    public ActeurServiceImpl() {
        listActeur = new ArrayList<>();
        listActeur.add(new Acteur(1, "jean1", "jean1"));
        listActeur.add(new Acteur(2, "jean2", "jean2"));
        listActeur.add(new Acteur(3, "jean3", "jean3"));

        mapActeur = new HashMap<>();
        listActeur.forEach(m -> mapActeur.put(m.getId(), m));

    }
    @Override
    public List<Acteur> getListActeur() {
        return listActeur;
    }

    @Override
    public Map<Integer, Acteur> getMapActeur() {
        return mapActeur;
    }
}
