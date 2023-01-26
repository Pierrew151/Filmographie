package com.example.filmographie.service;

import com.example.filmographie.bo.Realisateur;

import java.util.List;
import java.util.Map;

public interface RealisateurService {

    List<Realisateur> getListRealisateurs();
    Map<Integer, Realisateur> getMapRealisateurs();
}
