package com.example.demo;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Comtroller {


    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
}
