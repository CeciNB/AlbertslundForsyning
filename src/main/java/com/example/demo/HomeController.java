package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping ("/")
    public String index(){
        return "index";
    }
    @GetMapping ("/fjernvarme")
    public String fjernvarme(){
        return "fjernvarme";
    }
    @GetMapping ("/energibesparelse")
    public String energibesparelse(){
        return "energibesparelse";
    }
    @GetMapping ("/driftstatus")
    public String driftstatus(){
        return "driftstatus";
    }
}
