package com.example.filmographie.service.impl;

import com.example.filmographie.bo.*;
import com.example.filmographie.repositories.*;
import com.example.filmographie.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class InitServiceImpl implements InitService {
    private ActeurRepository acteurRepository;
    private CategorieRepository categorieRepository;
    private RealisateurRepository realisateurRepository;
    private FilmRepository filmRepository;
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;


    @Autowired
    public InitServiceImpl(
            ActeurRepository acteurRepository,
            CategorieRepository categorieRepository,
            RealisateurRepository realisateurRepository,
            FilmRepository filmRepository,
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {
        this.acteurRepository = acteurRepository;
        this.categorieRepository = categorieRepository;
        this.realisateurRepository = realisateurRepository;
        this.filmRepository = filmRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;

    }

    @Override
    public void init() {
        List<Acteur> listActeur = new ArrayList<>();
        listActeur.add(new Acteur(1, "jean1", "jean1"));
        listActeur.add(new Acteur(2, "jean2", "jean2"));
        listActeur.add(new Acteur(3, "jean3", "jean3"));
        acteurRepository.saveAll(listActeur);

        List<Categorie> listCategorie = new ArrayList<>();
        listCategorie.add(new Categorie(1, "Action"));
        listCategorie.add(new Categorie(2, "Comédie"));
        categorieRepository.saveAll(listCategorie);

        Realisateur realisateur = new Realisateur(1, "mark", "mark");
        realisateurRepository.save(realisateur);

        List<Film> listFilm = new ArrayList<>();
        listFilm.add(new Film(1, "test", Date.valueOf("2023-01-25"), 50, "https://source.unsplash.com/random/1000x1000?sig=1","MKSJGSKG<SLKGHSLKEHGPKGEJG", realisateur, listActeur, listCategorie.get(0)));
        listFilm.add(new Film(2, "testDeux", Date.valueOf("2022-01-25"), 150, "https://source.unsplash.com/random/1000x1000?sig=2","zefezfzfeg", realisateur, listActeur, listCategorie.get(0)));
        listFilm.add(new Film(3, "testTrois", Date.valueOf("2021-01-25"), 200, "https://source.unsplash.com/random/1000x1000?sig=3","yukykfgn", realisateur, listActeur, listCategorie.get(0)));
        listFilm.add(new Film(4, "testQuatre", Date.valueOf("2020-01-25"), 250, "https://source.unsplash.com/random/1000x1000?sig=4","mugkfyuffjugj", realisateur, listActeur, listCategorie.get(0)));
        filmRepository.saveAll(listFilm);

        User user = new User();
        user.setUsername("pnp");
        user.setPassword(passwordEncoder.encode("123465"));
        user.setAccountNonLocked(true);
        userRepository.save(user);

    }
}
