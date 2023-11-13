package com.example.resume_web.entity;


import lombok.*;

import javax.persistence.*;

@Entity
//@Table(name="orders") //디비 테이블 이름
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long boardId;

    @JoinColumn(name = "user_id")
    private Long userId;

    @JoinColumn(name = "board_id")
    private String boardTitle;

    @JoinColumn(name = "education_id")
    private Long educationId;

    @JoinColumn(name = "experience_id")
    private Long experienceId;

    @JoinColumn(name = "certification_id")
    private Long certificationId;

    @JoinColumn(name = "introduce_id")
    private Long introduceId;


}
