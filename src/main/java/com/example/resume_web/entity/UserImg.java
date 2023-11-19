package com.example.resume_web.entity;


import com.example.resume_web.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
//@Table(name = "userImg")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserImg extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_img_id")
    private Long userFileUuid;

    private String userFileOriName;    //원본 이미지 파일명

    private String userFileSystemName;      //이미지 파일명

    private String userFilePath;    //이미지 경로

}
