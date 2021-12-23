package esk.example.template.view_demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = ("/"))
public class HelloController {

    @GetMapping
    public String getHome(Model model) {
        model.addAttribute("message", "Up and running with Spring Boot!");
        return "home";
    }
}
