package com.example.filmographie.service;

import com.example.filmographie.bo.Categorie;
import com.example.filmographie.bo.Realisateur;

import java.util.List;
import java.util.Map;

public interface CategorieService {

    List<Categorie> getListCategorie();
    Map<Integer, Categorie> getMapCategorie();
}
