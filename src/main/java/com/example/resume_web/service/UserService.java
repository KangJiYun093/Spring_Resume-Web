package com.example.resume_web.service;

import com.example.resume_web.dto.UserDto;
import com.example.resume_web.entity.User;

public interface UserService {
//    로그인
    public UserDto login(String userEmail, String userPassword);

//    회원가입
    public void join(UserDto userDto);

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

    default User toUserEntity(UserDto userDto) {
        return User.builder()
                .userId(userDto.getUserId())
                .userEmail(userDto.getUserEmail())
                .userPassword(userDto.getUserPassword())
                .userName(userDto.getUserName())
                .userEname(userDto.getUserEname())
                .userPhone(userDto.getUserPhone())
                .userBirth(userDto.getUserBirth())
                .build();
    }
}
