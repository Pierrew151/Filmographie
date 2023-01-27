package com.example.filmographie.Controllers;

import com.example.filmographie.service.InitService;
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
        return "redirect:/";
    }
}
