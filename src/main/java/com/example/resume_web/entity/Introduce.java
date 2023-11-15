package com.example.resume_web.entity;


import com.example.resume_web.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.awt.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Introduce extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduce_id")
    private Long introduceId;

    private String introduceTitle;

    private TextArea introduceContent;
}
