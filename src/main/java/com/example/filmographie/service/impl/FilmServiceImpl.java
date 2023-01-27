package com.example.filmographie.service.impl;


import com.example.filmographie.bo.Film;
import com.example.filmographie.repositories.FilmRepository;
import com.example.filmographie.service.FilmService;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class FilmServiceImpl implements FilmService {

    private List<Film> listFilm;
    private Map<Integer, Film> mapFilm;

    private FilmRepository filmRepository;


    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> getListFilm() {
        listFilm = new ArrayList<>();
        listFilm = filmRepository.findAll();
        return listFilm;
    }

    @Override
    public Map<Integer, Film> getMapFilm() {
        return mapFilm;
    }

    @Override
    public Film getFilm(int id) {
        if(id != 0){
            return filmRepository.getReferenceById(Long.valueOf(id));
        }
        return null;
    }
}
