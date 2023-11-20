package com.example.resume_web.repository;

import com.example.resume_web.entity.User;

import java.util.Optional;

public interface UserQueryDSL {
//    로그인
    public Optional<User> login(String userEmail, String userPassword);
}
