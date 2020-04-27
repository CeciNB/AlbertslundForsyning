package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DriftStatusControlelr {
    @GetMapping("/driftstatus")
    public String driftstatus(){
        return "driftstatus";
    }
}
