package com.example.resume_web.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
//@Table(name="orders") //디비 테이블 이름
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    @JoinColumn(name = "user_id")
    private Long userId;

    @JoinColumn(name = "board_id")
    private String postTitle;

    @JoinColumn(name = "education_id")
    private Long educationId;

    @JoinColumn(name = "experience_id")
    private Long experienceId;

    @JoinColumn(name = "certification_id")
    private Long certificationId;

    @JoinColumn(name = "introduce_id")
    private Long introduceId;

    private LocalDateTime regTime;  //등록시간, localdatime 자바에서 제공하는 시간 함수

    private LocalDateTime updateTime;   //수정시간

}
