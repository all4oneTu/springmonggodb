package com.example.springmonggodb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Post")
public class Post {
    @Id
    private String id;
    private String idUser;
    private String title;
    private String text;
    private String image_src;
    private Integer upvotes;
    private Integer comments;
    private String community;
    private String username;
    private String created_at;
}
