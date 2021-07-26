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

    @GetMapping("/widgets")
    public String widgets() {
        return "widgets/widgets";
    }

    @GetMapping("/charts/chartjs")
    public String chartChartjs() {
        return "/charts/chartjs";
    }

    @GetMapping("/forms/general")
    public String formGeneral() {
        return "/forms/general";
    }

    @GetMapping("/forms/advanced")
    public String formAdvanced() {
        return "/forms/advanced";
    }

    @GetMapping("/forms/editors")
    public String formEditors() {
        return "/forms/editors";
    }

    @GetMapping("/forms/validation")
    public String formValidation() {
        return "/forms/validation";
    }

    @GetMapping("/tables/simple")
    public String tablesSimple() {
        return "/tables/simple";
    }
    @GetMapping("/tables/data")
    public String tablesData() {
        return "/tables/data";
    }
    @GetMapping("/tables/jsgrid")
    public String tablesJsGrid() {
        return "/tables/jsgrid";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
