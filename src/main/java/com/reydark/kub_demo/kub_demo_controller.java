package com.reydark.kub_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class kub_demo_controller {

    @GetMapping("/")
    public String Hello(Model model){
        model.addAttribute("message","Hello from K8.");
        return "index";
    }
}
