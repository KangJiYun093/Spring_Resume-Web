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
public class CertificationDto {
    private Long certificationId;

    private String certificationName;

    private String certificationAuthority;

    private Date certificationDate;

}
