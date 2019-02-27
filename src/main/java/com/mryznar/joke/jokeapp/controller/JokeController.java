package com.mryznar.joke.jokeapp.controller;

import com.mryznar.joke.jokeapp.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokesService jokesService;


    public JokeController(@Autowired JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String sayJoke(Model model){

        model.addAttribute("joke", jokesService.getJoke());
        return "chucknorris";
    }
}
