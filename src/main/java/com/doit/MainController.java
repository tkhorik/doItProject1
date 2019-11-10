package com.doit;

import com.doit.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {

    List<User> users = new ArrayList<>();

    @GetMapping("/users")
    @ResponseBody
    public String getUsers(Model model) {
        model.addAttribute("users", users);
        return "/users";
    }

    @GetMapping("/users/new")
    public String getSignUp() {
        return "/sign_up";
    }

    @PostMapping("/users/new")
    public String signUp(@ModelAttribute User user) {
        users.add(user);
        return "redirect:users";
    }

    @GetMapping("/")
    public String view(Model model) {
        model.addAttribute("msg", "Welcome to the Netherlands!");
        return "index";
    }

    /*
    By default it says User, but after parameter set return greeting by Name
        http://localhost:8080/doItProject1_war_exploded/param?name=Dmitry

    */
    @GetMapping("/param")
    public String view2(@RequestParam(value = "name",
            required = false, defaultValue = "User") String name, Model model) {
        model.addAttribute("msg", "Welcome " + name);
        return "index";
    }

    /*
        Here it returns name by commandline aleas like a paramenter
        http://localhost:8080/doItProject1_war_exploded/param_commandline/Dmitry
    */
    @GetMapping("/param_commandline/{name}")
    public String view3(@PathVariable("name") String name, Model model) {
        model.addAttribute("msg", "Hello " + name);
        return "index";
    }
}
