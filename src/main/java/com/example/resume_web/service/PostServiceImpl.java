package com.example.resume_web.service;

import com.example.resume_web.dto.PostDto;
import com.example.resume_web.entity.Post;
import com.example.resume_web.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto findAllByPostId(Long postId) {
        return toPostDTO(postRepository.findAllByPostId(postId).get());
    }

}
