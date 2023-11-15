package com.example.resume_web.dto;


import com.example.resume_web.entity.Post;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //디폴트 생성자
@Builder
public class PostWriteDto {

    private Post post;

}
