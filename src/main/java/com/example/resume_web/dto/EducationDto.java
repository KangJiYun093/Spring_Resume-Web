package com.example.resume_web.dto;

import com.example.resume_web.entity.Post;
import lombok.*;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //디폴트 생성자
@Builder
public class EducationDto {
    private Long educationId;

    private String educationBackground;     //학교명,전공

    private String educationLevel;      //최종학력

    private Date admissionYear;

    private Date graduationYear;

}
