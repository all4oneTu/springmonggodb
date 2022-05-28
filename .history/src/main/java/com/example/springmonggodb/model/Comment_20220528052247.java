package com.example.springmonggodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Comment")
public class Comment {
    @Id
    private String id;
    private String idUser;
    private String post;
    private String username;
    private String text;
    private String created_at;
}
