package com.apps.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "mainfile";
    }

    @GetMapping("/mainfile")
    public String mainPage() {
        return "mainfile";
    }

    @GetMapping("/applicationserverdetails")
    public String appServerPage() {
        return "applicationserverdetails";
    }

    @GetMapping("/clouddetails")
    public String cloudPage() {
        return "clouddetails";
    }

    @GetMapping("/databaseserverdetails")
    public String databasePage() {
        return "databaseserverdetails";
    }
}