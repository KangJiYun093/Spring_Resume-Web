package com.example.resume_web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post/*")
@RequiredArgsConstructor
public class PostController {

    @GetMapping("post-list")
    public String postList() {
        return "view/post-list";
    }

    @GetMapping("post-write")
    public String postWrite() {
        return "view/post-write";
    }
}
