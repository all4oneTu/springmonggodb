package com.example.springmonggodb.dto;

import lombok.Data;

@Data
public class PostDto {
    private String id;
    private String idUser;
    private String title;
    private String text;
    private String image_src;
    private Integer upvotes;
    private Integer comments;
    private String community;
    private String username;
}
