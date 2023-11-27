package com.example.resume_web.entity;


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
public class Introduce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduce_id")
    private Long introduceId;

    private String introduceTitle;

    private TextArea introduceContent;
}
