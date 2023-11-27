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

    private String companyName;

    private Date startDate;

    private Date endDate;

}
