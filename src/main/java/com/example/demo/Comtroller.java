package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Comtroller {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
    
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }
    
    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "안녕하세요!";
        }
        return "안녕하세요, " + name + "님!";
    }
}
