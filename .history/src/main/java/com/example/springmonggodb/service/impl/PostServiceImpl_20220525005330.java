package com.example.springmonggodb.service.impl;

import java.util.List;

import com.example.springmonggodb.dto.PostDto;
import com.example.springmonggodb.model.Post;
import com.example.springmonggodb.repository.PostRepository;
import com.example.springmonggodb.service.PostService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class PostServiceImpl implements PostService {


    private PostRepository postRepository;
    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
    public Post addPost(PostDto postDto) {
        Post post = new Post();
        BeanUtils.copyProperties(postDto, post);
        return postRepository.save(post);
    }

    @Override
    public Post findById(String id) {
        
        return postRepository.findById(id).get();
    }
    @Override
    public List<Post> getAllPosts(Sort sort) {
        
        return postRepository.findAll(Sort.by(Sort.Direction.DESC, "upvotes"));
    }
    @Override
    public Post updatePost(PostDto postDto) {
        Post post = findById(postDto.getId());
        BeanUtils.copyProperties(postDto, post);
        return postRepository.save(post);
    }
    @Override
    public Post getPost(String id) {
        Post post = findById(id);
        return post;
    }
    @Override
    public List<Post> getPostByCommunity(String community) {
        return postRepository.findByCommunity(community);
    }
    @Override
    public Post deletePostById(String id) {
        // TODO Auto-generated method stub
        return postRepository.de;
    }
    
}
