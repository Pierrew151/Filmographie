package com.example.filmographie.service.impl;

import com.example.filmographie.bo.Categorie;
import com.example.filmographie.repositories.CategorieRepository;
import com.example.filmographie.service.CategorieService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public class CategorieServiceImpl implements CategorieService {
    private List<Categorie> listCategorie;
    private Map<Integer, Categorie> mapCategorie;
    private CategorieRepository categorieRepository;



    public CategorieServiceImpl(CategorieRepository categorieRepository) {
       this.categorieRepository = categorieRepository;
    }

    @Override
    public List<Categorie> getListCategorie() {
        return categorieRepository.findAll();
    }

    @Override
    public Map<Integer, Categorie> getMapCategorie() {
        return mapCategorie;
    }
}
