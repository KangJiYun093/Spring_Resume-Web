package com.example.resume_web.service;

import com.example.resume_web.dto.UserDto;
import com.example.resume_web.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto login(String userEmail, String userPassword) {
        return toUserDTO(userRepository.login(userEmail, userPassword).get());
    }

    @Override
    public void join(UserDto userDto) {
        userRepository.save(toUserEntity(userDto));
    }
}
