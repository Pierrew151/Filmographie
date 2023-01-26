package com.example.filmographie.service.impl;

import com.example.filmographie.bo.Realisateur;
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

    public RealisateurServiceImpl() {
        listRealisateur = new ArrayList<>();
        listRealisateur.add(new Realisateur(1, "mark", "mark"));
        listRealisateur.add(new Realisateur(2, "mark1", "mar1k"));
        listRealisateur.add(new Realisateur(3, "mark2", "mar2k"));

        mapRealisateurs = new HashMap<>();
        listRealisateur.forEach(m -> mapRealisateurs.put(m.getId(), m));
    }

    @Override
    public List<Realisateur> getListRealisateurs() {
        return listRealisateur;
    }

    @Override
    public Map<Integer, Realisateur> getMapRealisateurs() {
        return mapRealisateurs;
    }
}
