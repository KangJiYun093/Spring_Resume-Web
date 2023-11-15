package com.example.resume_web.entity;


import com.example.resume_web.common.entity.BaseEntity;
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
public class Education extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id")
    private Long educationId;

    private String educationSchoolName;

    private String educationMajor;

    private Date admissionYear;

    private Date graduationYear;
}
