package com.example.filmographie.service;

import com.example.filmographie.bo.Film;
import com.example.filmographie.bo.Realisateur;

import java.util.List;
import java.util.Map;

public interface FilmService {

    List<Film> getListFilm();
    Map<Integer, Film> getMapFilm();

    Film getFilm(int id);

   void save(Film film);
}
