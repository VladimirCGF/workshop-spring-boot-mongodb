package com.example.workshopmongodb.repository;

import com.example.workshopmongodb.domain.Post;
import com.example.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
