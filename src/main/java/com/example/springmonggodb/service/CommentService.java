package com.example.springmonggodb.service;

import java.util.List;

import com.example.springmonggodb.dto.CommentDto;
import com.example.springmonggodb.model.Comment;

public interface CommentService {
    Comment createComment(CommentDto commentDto);

    Comment getCommentById(String id);

    List<Comment> getCommentListByPost(String post);
}
