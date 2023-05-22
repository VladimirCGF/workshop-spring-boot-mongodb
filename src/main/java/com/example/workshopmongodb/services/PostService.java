package com.example.workshopmongodb.services;

import com.example.workshopmongodb.domain.Post;
import com.example.workshopmongodb.domain.User;
import com.example.workshopmongodb.dto.UserDTO;
import com.example.workshopmongodb.repository.PostRepository;
import com.example.workshopmongodb.repository.UserRepository;
import com.example.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

}