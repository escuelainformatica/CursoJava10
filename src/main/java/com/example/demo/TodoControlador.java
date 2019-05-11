package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoControlador {
    @RequestMapping("/")
    public String raiz() {
        return "raiz";
    }
    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/403")
    public String p403() {
        return "403";
    }
}
