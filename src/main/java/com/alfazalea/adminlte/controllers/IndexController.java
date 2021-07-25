package com.alfazalea.adminlte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/dashboard-v2")
    public String dashboardv2() {
        return "dashboard/dashboardv2";
    }
    @GetMapping("/dashboard-v3")
    public String dashboardv3() {
        return "dashboard/dashboardv3";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
