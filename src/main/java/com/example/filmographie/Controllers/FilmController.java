package com.example.filmographie.Controllers;

import com.example.filmographie.bo.Categorie;
import com.example.filmographie.bo.Film;
import com.example.filmographie.bo.Realisateur;
import com.example.filmographie.service.CategorieService;
import com.example.filmographie.service.FilmService;
import com.example.filmographie.service.RealisateurService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmController {

    private FilmService filmService;
    private CategorieService categorieService;
    private RealisateurService realisateurService;

    public FilmController(FilmService filmService, CategorieService categorieService, RealisateurService realisateurService) {
        this.filmService = filmService;
        this.categorieService = categorieService;
        this.realisateurService = realisateurService;
    }

    @ModelAttribute("films")
    public List<Film> getPersonnes() {
        return new ArrayList<>();
    }



    @RequestMapping("/movie/{id}")
    public String movieDetails(@PathVariable String id, Model model) {
        if (id != null) {
            var film = filmService.getFilm(Integer.parseInt(id));
            model.addAttribute("movie", film);
            return "edit-movie";
        }
        return "home";
    }


    @PostMapping("/film/ajout")
    public String ajoutFilm(@Valid @ModelAttribute("film") Film film) {
        filmService.save(film);
        return "home";
    }
    @GetMapping("/film/ajout")
    public String traitFormulaire(
            Model model
    ) {
        List<Categorie> categories = new ArrayList<>();
        categories = categorieService.getListCategorie();
        List<Realisateur> realisateurs = new ArrayList<>();
        realisateurs = realisateurService.getListRealisateurs();

        model.addAttribute("categories", categories);
        model.addAttribute("realisateurs", realisateurs);

        return "films/ajoutFilm";
    }
}
