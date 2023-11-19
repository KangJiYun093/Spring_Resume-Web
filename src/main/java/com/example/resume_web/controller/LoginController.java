package com.example.resume_web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class LoginController {

    @GetMapping("login")
    public String login() {
        return "user/userLoginForm";
    }

    @GetMapping("join")
    public String join() {
        return "user/userSignIn";
    }

    @GetMapping("edit")
    public String edit() {
        return "user/userEditForm";
    }
}
