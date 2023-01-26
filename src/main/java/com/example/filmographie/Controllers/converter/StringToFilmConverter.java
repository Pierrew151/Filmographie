package com.example.filmographie.Controllers.converter;

import com.example.filmographie.bo.Film;
import com.example.filmographie.service.FilmService;
import com.example.filmographie.service.impl.FilmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToFilmConverter implements Converter<String, Film> {

    private FilmService service;

    @Autowired
    public void setFilmService(FilmServiceImpl service){this.service=service;}

    @Override
    public Film convert(String source) {
        Integer id = Integer.parseInt(source);
        return service.getMapFilm().get(id);
    }
}
