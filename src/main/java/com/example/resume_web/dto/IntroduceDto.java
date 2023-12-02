package com.example.resume_web.dto;

import lombok.*;

import java.awt.*;

@Setter
@Getter
@ToString
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //디폴트 생성자
@Builder
public class IntroduceDto {
    private Long introduceId;

    private String introduceTitle;

    private String introduceContent;
}
