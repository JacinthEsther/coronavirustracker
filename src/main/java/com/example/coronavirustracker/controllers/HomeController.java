package com.example.coronavirustracker.controllers;

import com.example.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private CoronaVirusDataService service;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStats",service.getAllStats());
        return "index";
    }
}
