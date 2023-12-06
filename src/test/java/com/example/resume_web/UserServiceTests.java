package com.example.resume_web;

import com.example.resume_web.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @Test
    public void loginTest() {
        System.out.println(userService.login("tonky0810@naver.com", "ABcd1234**") + "?????????????????????????????????????");
    }
}
