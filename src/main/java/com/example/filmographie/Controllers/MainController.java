package com.example.filmographie.Controllers;


import com.example.filmographie.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
    private FilmService filmService;

    public MainController(FilmService filmService) {
        this.filmService = filmService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        var films = filmService.getListFilm();
        model.addAttribute("films", films);
        return "home";
    }

    @RequestMapping("/edit")
    public String edit(Model model) {

        return "edit-movie";
    }

}
