package com.example.filmographie.Controllers.converter;

import com.example.filmographie.bo.Categorie;
import com.example.filmographie.repositories.CategorieRepository;
import com.example.filmographie.service.CategorieService;
import com.example.filmographie.service.impl.CategorieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToCategorieConverter implements Converter<String, Categorie> {

    private CategorieRepository categorieRepository;

    @Autowired
    public void setService( CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public Categorie convert(String source) {
        Integer id = Integer.parseInt(source);
        return categorieRepository.getReferenceById(Long.valueOf(id));
    }
}
