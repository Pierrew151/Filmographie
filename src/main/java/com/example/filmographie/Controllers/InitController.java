package com.example.filmographie.Controllers;

import com.example.filmographie.repositories.ActeurRepository;
import com.example.filmographie.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitController {
    private InitService initService;
    public InitController(InitService initService){
        this.initService = initService;
    }

    @RequestMapping("/init")
    public String init() {
        initService.init();
        return "home";
    }
}
