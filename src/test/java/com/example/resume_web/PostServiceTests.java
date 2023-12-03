package com.example.resume_web;

import com.example.resume_web.service.PostService;
import com.example.resume_web.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
public class PostServiceTests {

    @Autowired
    private PostService postService;

    @Test
    public void getPostList(){
        System.out.println(postService.getPostList().toString());
    }

    @Test
    public void getPost(){
        System.out.println(postService.getPostDetail(5L).toString());
    }
}
