package com.example.springmonggodb.dto;

import lombok.Data;

@Data
public class CommentDto {
    private String id;
    private String idUser;
    private String post;
    private String username;
    private String text;
    private String created
}
