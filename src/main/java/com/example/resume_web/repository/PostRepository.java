package com.example.resume_web.repository;

import com.example.resume_web.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PostRepository extends JpaRepository<Post, Long>, PostQueryDSL{
}
