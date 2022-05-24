package com.example.springmonggodb.repository;

import java.util.List;


import com.example.springmonggodb.model.Comment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    
    List<Comment> findByPost(String post);
}
