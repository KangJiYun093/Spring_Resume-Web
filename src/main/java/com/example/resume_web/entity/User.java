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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(unique = true)
    private String userEmail;

    private String userPassword;

    private String userName;

    private String userEname;

    private String userPhone;

    private Date userBirth;

    //사진 파일 첨부
//    private String userFileOriginalName;
//
//    private String userFileSystemName;
//
//    private String userFileUuid;
//
//    private String userFilePath;
}
