package com.example.filmographie.Controllers.converter;

import com.example.filmographie.bo.Acteur;
import com.example.filmographie.service.ActeurService;
import com.example.filmographie.service.impl.ActeurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToActeurConverter implements Converter<String, Acteur> {

    private ActeurService service;

    @Autowired
    public void setService(ActeurServiceImpl service) {
        this.service = service;
    }

    @Override
    public Acteur convert(String source) {
        Integer id = Integer.parseInt(source);
        return service.getMapActeur().get(id);
    }
}
