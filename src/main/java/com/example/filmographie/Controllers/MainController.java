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
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/edit")
    public String edit(Model model) {

        return "edit-movie";
    }

}
