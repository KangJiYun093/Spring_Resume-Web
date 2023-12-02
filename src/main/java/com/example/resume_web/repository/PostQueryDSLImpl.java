package com.example.resume_web.repository;

import com.example.resume_web.entity.Post;
import com.example.resume_web.entity.QPost;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.resume_web.entity.QPost.post;

@RequiredArgsConstructor
public class PostQueryDSLImpl implements PostQueryDSL {
    private final JPAQueryFactory query;

    @Override
    public List<Post> findAllByPostId(Long postId) {
        QPost post = QPost.post;

        return query.selectFrom(post)
                .where(post.postId.eq(postId))
                .fetch();
    }

    @Override
    public List<Tuple> findPostDetailsByPostId(Long postId) {
        QPost qPost = QPost.post;

        return query.select(qPost.educationId, qPost.experienceId,
                        qPost.certificationId, qPost.introduceId, qPost.postTitle,
                        qPost.userName, qPost.userEmail, qPost.userBirth, qPost.userPhone,
                        qPost.simplePr,qPost.regTime, qPost.updateTime)
                .from(qPost)
                .where(qPost.postId.eq(postId))
                .fetch();
    }

}
