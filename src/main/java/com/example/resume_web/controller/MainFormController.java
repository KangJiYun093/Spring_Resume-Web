package com.example.resume_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class MainFormController {

    @GetMapping("main-page")
    public String showMainPage() {
        return "view/main-page";
    }
}
