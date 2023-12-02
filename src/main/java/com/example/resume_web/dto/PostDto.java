package com.example.resume_web.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //디폴트 생성자
@Builder
public class PostDto {
    private Long postId;
    private Long certificationId;
    private Long educationId;
    private Long experienceId;
    private Long introduceId;
    private String postTitle;
    private String simplePr;
    private String userEmail;
    private String userName;
    private String userPhone;
    private Date userBirth;
    private String regTime;
    private String updateTime;
//    private Integer userId;

}
