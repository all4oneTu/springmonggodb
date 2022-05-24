package com.example.springmonggodb.repository;

import java.util.List;

import com.example.springmonggodb.model.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,String>{
    @Query("{upvotes: ?0}")
    List<Post> findAll();

    List<Post> finByCommunity(community);
}
