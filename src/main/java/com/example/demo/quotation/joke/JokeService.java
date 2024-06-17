package com.example.demo.quotation.joke;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class JokeService {
    @Autowired
    private JokeRepository repository;

    public List<Joke> getAll() {
        return repository.findAll();
    }

    public Joke getJokeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(id + " not found"));
    }
}
