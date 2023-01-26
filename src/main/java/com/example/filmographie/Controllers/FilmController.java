package com.example.filmographie.Controllers;

import com.example.filmographie.bo.Acteur;
import com.example.filmographie.bo.Categorie;
import com.example.filmographie.bo.Film;
import com.example.filmographie.bo.Realisateur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmController {

    @RequestMapping("/film/ajout")
    public String ajoutFilm(Model model){
        Realisateur realisateur = new Realisateur(1, "mark", "mark");
        Acteur acteur1 = new Acteur(1, "jean", "jean");
        Acteur acteur2 = new Acteur(2, "jean1", "jean1");
        Acteur acteur3 = new Acteur(3, "jean2", "jean2");
        List<Acteur> acteurList = new ArrayList<>();
        acteurList.add(acteur1);
        acteurList.add(acteur2);
        acteurList.add(acteur3);

        Categorie categorie = new Categorie(1, "test");

        Film film = new Film(1, "test", Date.valueOf("2023-01-25"), 50,"MKSJGSKG<SLKGHSLKEHGPKGEJG", realisateur, acteurList, categorie);
        model.addAttribute("film", film);

        return "films/ajoutFilm";
    }
}
