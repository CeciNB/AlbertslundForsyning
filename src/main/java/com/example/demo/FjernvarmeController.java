package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FjernvarmeController {
    @GetMapping("/fjernvarme")
    public String fjernvarme(){
        return "fjernvarme";
    }

    @GetMapping("/fjernvarme/tao-ordningen")
    public String fjernvarmeTAO(){
        return "/fjernvarme/tao-ordningen";
    }

    @GetMapping("/fjernvarme/hvad-er-fjernvarme")
    public String fjernvarmeHvadErFjernvarme(){
        return "/fjernvarme/hvad-er-fjernvarme";
    }

    @GetMapping("/fjernvarme/lavtemperaturfjernvarme")
    public String fjernvarmelavtemperaturfjernvarme(){
        return "/fjernvarme/lavtemperaturfjernvarme";
    }

    @GetMapping("/fjernvarme/udskiftning-af-maalere")
    public String fjernvarmeUdskift(){
        return "/fjernvarme/udskiftning-af-maalere";
    }

    @GetMapping("/fjernvarme/takster-og-bestemmelser")
    public String fjernvarmeTakstert(){
        return "/fjernvarme/takster-og-bestemmelser";
    }

    @GetMapping("/fjernvarme/planlagte-renoveringer")
    public String fjernvarmeRenovering(){
        return "/fjernvarme/planlagte-renoveringer";
    }

    @GetMapping("/fjernvarme/ledningsoplysninger")
    public String fjernvarmeLeding(){
        return "/fjernvarme/ledningsoplysninger";
    }

    @GetMapping("/fjernvarme/driftsstatus")
    public String fjernvarmeDrift(){
        return "/fjernvarme/driftsstatus.html";
    }

    @GetMapping("/fjernvarme/covid-19")
    public String fjernvarmeCovid19(){
        return "/fjernvarme/covid-19.html";
    }


}
