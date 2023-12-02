package com.example.resume_web.service;

import com.example.resume_web.dto.PostDto;
import com.example.resume_web.entity.Post;
import com.example.resume_web.repository.PostRepository;
import com.querydsl.core.Tuple;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {

    @Autowired
    private final PostRepository postRepository;

    public List<Post> getPostList(Long postId){
        return postRepository.findAllByPostId(postId);
    }

    public List<Tuple> getPostDetail(Long postId){
        return postRepository.findPostDetailsByPostId(postId);
    }

    public PostDto toPostDTO(Post post) {
        return PostDto.builder()
                .postId(post.getPostId())
                .educationId(post.getEducationId())
                .experienceId(post.getExperienceId())
                .certificationId(post.getCertificationId())
                .introduceId(post.getIntroduceId())
                .postTitle(post.getPostTitle())
                .userName(post.getUserName())
                .userEmail(post.getUserEmail())
                .userBirth(post.getUserBirth())
                .userPhone(post.getUserPhone())
                .simplePr(post.getSimplePr())
                .regTime(post.getRegTime().toString())
                .updateTime(post.getUpdateTime().toString())
                .build();
    }

    public Post toPostEntity(PostDto postDto) {
        return Post.builder()
                .postId(postDto.getPostId())
                .educationId(postDto.getEducationId())
                .experienceId(postDto.getExperienceId())
                .certificationId(postDto.getCertificationId())
                .introduceId(postDto.getIntroduceId())
                .postTitle(postDto.getPostTitle())
                .userName(postDto.getUserName())
                .userEmail(postDto.getUserEmail())
                .userBirth(postDto.getUserBirth())
                .userPhone(postDto.getUserPhone())
                .simplePr(postDto.getSimplePr())
                .regTime(LocalDateTime.parse(postDto.getRegTime()))
                .updateTime(LocalDateTime.parse(postDto.getUpdateTime()))
                .build();

    }

    
}
