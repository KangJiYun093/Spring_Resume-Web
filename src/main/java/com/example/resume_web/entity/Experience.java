package com.example.resume_web.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    private Long experienceId;

    private String companyNameDepart;     //회사이름,소속부서

    private Date startDate;     //입사날짜

    private Date endDate;       //퇴사날짜

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

}
