package com.example.resume_web.dto;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //디폴트 생성자
@Builder
public class PostDto {
    private Integer postId;
    private Integer regDate;
    private LocalDateTime updateDate;
    private LocalDateTime createBy;
    private Integer modifiedBy;
    private Integer certificationId;
    private Integer educationId;
    private Integer experienceId;
    private Integer introduceId;
    private Integer postTitle;
    private String regTime;
    private String updateTime;
    private Integer userId;

}
