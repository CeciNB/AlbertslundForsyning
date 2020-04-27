package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnergibesparelseController {
    @GetMapping ("energibesparelser")
    public String energibesparelser(){
        return "energibesparelser";
    }
    @GetMapping ("/energibesparelser/energibesparelser")
    public String energibesparelserEnergibesparelser(){
        return "energibesparelser/energibesparelser";
    }
    @GetMapping ("/energibesparelser/energitilskud")
    public String energibesparelserEnergitilskud(){
        return "/energibesparelser/energitilskud";
    }
    @GetMapping ("/energibesparelser/energiraadgivning")
    public String energibesparelserEnergiraadgivning(){
        return "/energibesparelser/energiraadgivning";
    }
}
