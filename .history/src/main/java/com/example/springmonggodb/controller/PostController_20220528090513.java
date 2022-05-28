package com.example.springmonggodb.controller;

import java.util.List;

import com.example.springmonggodb.dto.PostDto;
import com.example.springmonggodb.model.Post;
import com.example.springmonggodb.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="https://react-font-end.vercel.app/", allowedHeaders="*")
@CrossOrigin
@RestController
@RequestMapping("post")
public class PostController {

    private PostService postService;
    
    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping("add")
    public ResponseEntity<Post> addPost(@RequestBody PostDto postDto) {
        Post post = postService.addPost(postDto);
        return ResponseEntity.ok(post);
    }
    @GetMapping("getAll")
    public ResponseEntity<List<Post>> getAllUser() {
        List<Post> user = postService.getAllPosts(Sort.by(Sort.Direction.DESC, "upvotes"));
        // List<Post> user = postService.getAllPosts();
        return ResponseEntity.ok(user);
    }
    @GetMapping("getAllBySort")
    public ResponseEntity<List<Post>> getAllUserBySort() {
        List<Post> user = postService.getAllPostsBySort(Sort.by(Sort.Direction.ASC, "created_at"));
        // List<Post> user = postService.getAllPosts();
        return ResponseEntity.ok(user);
    }
    @GetMapping("get")
    public ResponseEntity<Post> getPost(@RequestParam("id") String id) {
        Post post = postService.findById(id);

        return ResponseEntity.ok(post);
    }
  
    @PutMapping("update")
    public ResponseEntity<Post> updateEmployee(@RequestBody PostDto postDto) {
        // Employee employee = employeeService.updateEmployee(employeeDto);
        Post post = postService.updatePost(postDto);
        return ResponseEntity.ok(post);
    }
    @GetMapping("getAllByCom")
    public ResponseEntity<List<Post>> getAllPostByComunity(@RequestParam("community") String community) {
        List<Post> post = postService.getPostByCommunity(community);
        return ResponseEntity.ok(post);
    }
    @DeleteMapping("deletePost")
    public ResponseEntity<String> deletePost(@RequestParam("id") String id) {
        postService.deletePostById(id);
        return ResponseEntity.ok("Post deleted successfully");
    }

}
