package com.example.resume_web.dto;

import com.example.resume_web.entity.User;
import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //디폴트 생성자
@Builder
public class UserDto {

    private User user;
}
