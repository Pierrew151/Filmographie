package com.example.filmographie.config;

import com.example.filmographie.bo.Acteur;
import com.example.filmographie.bo.Categorie;
import com.example.filmographie.bo.Film;
import com.example.filmographie.bo.Realisateur;
import com.example.filmographie.service.ActeurService;
import com.example.filmographie.service.CategorieService;
import com.example.filmographie.service.FilmService;
import com.example.filmographie.service.RealisateurService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.List;

@Configuration
public class FilmographieConfig {
    @Bean
    @ApplicationScope
    public List<Realisateur> realisateurs(RealisateurService service){
        return service.getListRealisateurs();
    }

    @Bean
    @ApplicationScope
    public List<Acteur> acteurs(ActeurService service){
        return service.getListActeur();
    }

    @Bean
    @ApplicationScope
    public List<Categorie> categories(CategorieService service){
        return service.getListCategorie();
    }

    @Bean
    @ApplicationScope
    public List<Film> films(FilmService service){
        return service.getListFilm();
    }
}
