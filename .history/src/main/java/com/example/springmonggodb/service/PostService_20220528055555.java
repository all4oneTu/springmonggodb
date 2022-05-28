package com.example.springmonggodb.service;

import java.util.List;

import com.example.springmonggodb.dto.PostDto;
import com.example.springmonggodb.model.Post;

import org.springframework.data.domain.Sort;

public interface PostService {   
    Post addPost(PostDto postDto);

    Post findById(String id);

    List<Post> getAllPosts(Sort sort);

    List<Post> getAllPostsBySort(sort )
    
    Post updatePost(PostDto postDto);

    Post getPost(String id);

    List<Post> getPostByCommunity(String community);

    void deletePostById(String id);
}
