package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DriftStatusController {
   @GetMapping("/driftsstatus")
    public String driftstatus(){
        return "/driftsstatus";
    }

}
