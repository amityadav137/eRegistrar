package edu.miu.cs.cs425.demowebapps.eRegistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/eregistrar", "/eregistrar/home"})
    public String homePage(){
        return "home/home";
    }
}
