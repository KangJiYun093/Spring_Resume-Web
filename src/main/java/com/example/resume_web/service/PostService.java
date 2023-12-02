package com.example.resume_web.service;

import com.example.resume_web.dto.PostDto;
import com.example.resume_web.entity.Post;

import java.time.LocalDateTime;
import java.util.List;

public interface PostService {

//    전체 조회
    public PostDto findAllByPostId(Long postId);

    default PostDto toPostDTO(Post post) {
        return PostDto.builder()
                .postId(post.getPostId())
                .educationId(post.getEducationId())
                .experienceId(post.getExperienceId())
                .certificationId(post.getCertificationId())
                .introduceId(post.getIntroduceId())
                .postTitle(String.valueOf(post.getPostTitle()))
                .userName(post.getUserName())
                .userEmail(post.getUserEmail())
                .userBirth(post.getUserBirth())
                .userPhone(post.getUserPhone())
                .simplePr(post.getSimplePr())
                .regTime(String.valueOf(post.getRegTime()))
                .updateTime(String.valueOf(post.getUpdateTime()))
                .build();
    }

    default Post toPostEntity(PostDto postDto) {
        return Post.builder()
                .postId(postDto.getPostId())
                .educationId(postDto.getEducationId())
                .experienceId(postDto.getExperienceId())
                .certificationId(postDto.getCertificationId())
                .introduceId(postDto.getIntroduceId())
                .postTitle(String.valueOf(postDto.getPostTitle()))
                .userName(postDto.getUserName())
                .userEmail(postDto.getUserEmail())
                .userBirth(postDto.getUserBirth())
                .userPhone(postDto.getUserPhone())
                .simplePr(postDto.getSimplePr())
                .regTime(LocalDateTime.parse(String.valueOf(postDto.getRegTime())))
                .updateTime(LocalDateTime.parse(String.valueOf(postDto.getUpdateTime())))
                .build();

    }

}
