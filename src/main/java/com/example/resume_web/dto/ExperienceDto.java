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
public class ExperienceDto {
    private Long experienceId;

    private String companyNameDepart;     //회사이름,소속부서

    private Date startDate;     //입사날짜

    private Date endDate;       //퇴사날짜

}
