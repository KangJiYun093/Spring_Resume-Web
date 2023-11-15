package com.example.resume_web.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //디폴트 생성자
@Builder
public class PostListDto {

    private Long postId;

    private Long userId;

    private String postTitle;
}
