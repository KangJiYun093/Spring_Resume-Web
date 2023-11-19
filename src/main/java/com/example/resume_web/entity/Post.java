package com.example.resume_web.entity;


import com.example.resume_web.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
//@Table(name="posts")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post extends BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name = "board_id")
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
