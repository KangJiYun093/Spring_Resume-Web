package com.example.resume_web.common.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass   //상속받는 클래스에게 매핑 정보만 제공하는 클래스
@Getter
@Setter
public class BaseTimeEntity {

    @CreatedDate
    @Column(updatable = false)  //update 안하겠다
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime updateDate;
}
