package com.example.resume_web.repository;

import com.example.resume_web.entity.Post;
import com.example.resume_web.entity.QPost;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import static com.example.resume_web.entity.QPost.post;

@RequiredArgsConstructor
public class PostQueryDSLImpl implements PostQueryDSL {
    private final JPAQueryFactory query;


}
