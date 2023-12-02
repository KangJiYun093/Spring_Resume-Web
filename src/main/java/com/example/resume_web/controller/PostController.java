package com.example.resume_web.controller;

import com.example.resume_web.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post/*")
@RequiredArgsConstructor
public class PostController {

//    private final PostService postService;

    @GetMapping("post-list2")
    public String postList() {


        return "view/post-list2";
    }

    @GetMapping("post-write")
    public String postWrite() {
        return "view/post-write";
    }
}
