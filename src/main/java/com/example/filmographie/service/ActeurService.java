package com.example.filmographie.service;

import com.example.filmographie.bo.Acteur;
import com.example.filmographie.bo.Categorie;

import java.util.List;
import java.util.Map;

public interface ActeurService {

    List<Acteur> getListActeur();
    Map<Integer, Acteur> getMapActeur();
}
