package com.example.filmographie.service.impl;

import com.example.filmographie.bo.Categorie;
import com.example.filmographie.bo.Realisateur;
import com.example.filmographie.service.CategorieService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategorieServiceImpl implements CategorieService {
    private List<Categorie> listCategorie;
    private Map<Integer, Categorie> mapCategorie;

    public CategorieServiceImpl() {
        listCategorie = new ArrayList<>();
        listCategorie.add(new Categorie(1, "Horreur"));
        listCategorie.add(new Categorie(2, "Action"));
        listCategorie.add(new Categorie(3, "Aventure"));

        mapCategorie = new HashMap<>();
        listCategorie.forEach(m -> mapCategorie.put(m.getId(), m));

    }

    @Override
    public List<Categorie> getListCategorie() {
        return listCategorie;
    }

    @Override
    public Map<Integer, Categorie> getMapCategorie() {
        return mapCategorie;
    }
}
