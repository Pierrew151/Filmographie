package com.example.filmographie.Controllers.converter;

import com.example.filmographie.bo.Film;
import com.example.filmographie.bo.Realisateur;
import com.example.filmographie.repositories.RealisateurRepository;
import com.example.filmographie.service.FilmService;
import com.example.filmographie.service.RealisateurService;
import com.example.filmographie.service.impl.FilmServiceImpl;
import com.example.filmographie.service.impl.RealisateurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class StringToRealisateurConverter implements Converter<String, Realisateur> {

    private RealisateurRepository realisateurRepository;

    @Autowired
    public void setRealisateurService(RealisateurRepository realisateurRepository) {
        this.realisateurRepository = realisateurRepository;
    }

    @Override
    public Realisateur convert(String id) {
        Integer theid = Integer.parseInt(id);
        return realisateurRepository.getReferenceById(Long.valueOf(theid));
    }
}
