package com.example.resume_web.controller;

import com.example.resume_web.dto.UserDto;
import com.example.resume_web.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("login")
    public String login() {
        return "user/userLoginForm";
    }

    @PostMapping("login")
    public RedirectView login(String userEmail, String userPassword, HttpSession session) {
        UserDto userDto = userService.login(userEmail, userPassword);

        if(userDto != null) {
            session.setAttribute("member", userDto);

            return new RedirectView("/post/post-list");
        }

        return new RedirectView("/login?result=fail");
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
