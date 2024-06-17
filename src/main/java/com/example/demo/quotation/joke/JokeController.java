package com.example.demo.quotation.joke;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/joke")
@RequiredArgsConstructor

public class JokeController {
    @Autowired
    private JokeService jokeservice;

    @GetMapping("/get/all")
    public ResponseEntity<List<Joke>>getAll(){List<Joke> jokes = jokeservice.getAll();
    return new ResponseEntity<>(jokes, HttpStatus.OK);}

    @GetMapping("/{id}") //http://localhost:8080/api/v1/Joke/get/id
    public Joke getJokeById(@PathVariable("id") Long id) {
        return jokeservice.getJokeById(id);

    }
}
