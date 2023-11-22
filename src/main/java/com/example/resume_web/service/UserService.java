package com.example.resume_web.service;

import com.example.resume_web.dto.UserDto;
import com.example.resume_web.entity.User;

public interface UserService {
//    로그인
    public UserDto login(String userEmail, String userPassword);

    default UserDto toUserDTO(User user) {
        return UserDto.builder()
                .userId(user.getUserId())
                .userEmail(user.getUserEmail())
                .userPassword(user.getUserPassword())
                .userName(user.getUserName())
                .userEname(user.getUserEname())
                .userPhone(user.getUserPhone())
                .userBirth(user.getUserBirth())
                .build();
    }
}
