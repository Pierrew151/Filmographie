package com.example.filmographie.service.impl;

import com.example.filmographie.bo.Realisateur;
import com.example.filmographie.repositories.RealisateurRepository;
import com.example.filmographie.service.RealisateurService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RealisateurServiceImpl implements RealisateurService {

    private List<Realisateur> listRealisateur;
    private Map<Integer, Realisateur> mapRealisateurs;

    private RealisateurRepository realisateurRepository;


    public RealisateurServiceImpl(RealisateurRepository realisateurRepository) {
       this.realisateurRepository = realisateurRepository;
    }

    @Override
    public List<Realisateur> getListRealisateurs() {
        return realisateurRepository.findAll();
    }

    @Override
    public Map<Integer, Realisateur> getMapRealisateurs() {
        return mapRealisateurs;
    }
}
