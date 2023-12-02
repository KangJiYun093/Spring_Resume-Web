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

    @Override
    public List<Post> findAllByPostId(Long postId) {

        return query.selectFrom(post)
                .where(post.postId.eq(postId))
                .fetch();
    }

//    @Override
//    public Optional<Post> findPostDetailsByPostId(Long postId) {
//
////        return query.select(post.educationId, post.experienceId,
////                        post.certificationId, post.introduceId, post.postTitle,
////                        post.userName, post.userEmail, post.userBirth, post.userPhone,
////                        post.simplePr,post.regTime, post.updateTime)
////                .from(post)
////                .where(post.postId.eq(postId))
////                .fetchOne();
//
//        return query.select(post.educationId, post.experienceId,
//                post.certificationId, post.introduceId, post.postTitle,
//                post.userName, post.userEmail, post.userBirth, post.userPhone,
//                post.simplePr,post.regTime, post.updateTime)
//                .from(post)
//                .where(post.postId.eq(postId))
//                .fetchOne();
//    }

}
