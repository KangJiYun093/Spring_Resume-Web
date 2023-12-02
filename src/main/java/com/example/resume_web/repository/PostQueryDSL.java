package com.example.resume_web.repository;

import com.example.resume_web.entity.Post;
import com.querydsl.core.Tuple;

import java.util.List;

public interface PostQueryDSL {

    List<Post> findAllByPostId(Long postId);

    List<Tuple> findPostDetailsByPostId(Long postId);
}
