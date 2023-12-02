package com.example.resume_web.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

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

    private String postTitle;

    private String userEmail;

    private String userName;

    private String userPhone;

    private Date userBirth;

    private String simplePr;    //간단 소개

    private LocalDateTime regTime;  //등록시간, localdatime 자바에서 제공하는 시간 함수

    private LocalDateTime updateTime;   //수정시간

    @OneToMany(mappedBy ="post", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Certification> certification;

    @OneToMany(mappedBy ="post", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Education> education;

    @OneToMany(mappedBy ="post", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Experience> experience;

    @OneToMany(mappedBy ="post", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Introduce> introduce;

}
