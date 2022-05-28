package com.example.springmonggodb.controller;

import java.util.List;

import com.example.springmonggodb.dto.CommentDto;
import com.example.springmonggodb.model.Comment;
import com.example.springmonggodb.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @CrossOrigin(origins="https://react-font-end.vercel.app/", allowedHeaders="*")
@CrossOrigin
@RestController
@RequestMapping("comment")
public class CommentController {
    private CommentService commentService;
    
    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }
    @PostMapping("creat")
    public ResponseEntity<Comment> createComment(@RequestBody CommentDto commentDto) {
        Comment comment = commentService.createComment(commentDto);
        return ResponseEntity.ok(comment);
    }
    @GetMapping("getAll")
    public ResponseEntity<List<Comment>> getAllComment(@RequestParam("post") String post) {
        List<Comment> commentList = commentService.getCommentListByPost(post);
        return ResponseEntity.ok(commentList);
    }
}
