package com.example.springmonggodb.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.springmonggodb.dto.CommentDto;
import com.example.springmonggodb.model.Comment;
import com.example.springmonggodb.repository.CommentRepository;
import com.example.springmonggodb.service.CommentService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CommentServiceImpl implements CommentService {
    
    private CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment createComment(CommentDto commentDto) {
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDto, comment);
        return commentRepository.save(comment);
    }

    // @Override
    // public Comment getCommentById(String id) {
    //     // TODO Auto-generated method stub
    //     return commentRepository.findById(id).get();
    // }

    @Override
    public List<Comment> getCommentListByPost(String post) {
        // TODO Auto-generated method stub
        return commentRepository.findByPost(post);
    }

    @Override
    public Comment getCommentById(String id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
