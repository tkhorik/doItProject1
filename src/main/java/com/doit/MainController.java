package com.doit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String view(Model model){
        model.addAttribute("msg", "Welcome to the Netherlands!");
        return "index";
    }
/*
By default it says User, but after parameter set return greeting by Name
    http://localhost:8080/doItProject1_war_exploded/param?name=Dmitry

*/
    @GetMapping("/param")
    public String view2(@RequestParam(value ="name",
            required = false,defaultValue = "User") String name,Model model){
        model.addAttribute("msg", "Welcome "+name);
        return "index";
    }

/*
    Here it returns name by commandline aleas like a paramenter
    http://localhost:8080/doItProject1_war_exploded/param_commandline/Dmitry
*/
    @GetMapping("/param_commandline/{name}")
    public String view3(@PathVariable ("name")String name,Model model){
        model.addAttribute("msg", "Hello "+name);
        return "index";
    }
}
