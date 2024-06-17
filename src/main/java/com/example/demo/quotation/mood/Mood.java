package com.example.demo.quotation.mood;

import com.example.demo.quotation.joke.Joke;
import com.example.demo.quotation.quotation.Quotation;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Entity

public class Mood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="mood_name", columnDefinition = "VARCHAR(100)", nullable = false)
    private String mood_name;

    @Column(name="mood_img", columnDefinition =  "VARCHAR(255)")
    private String mood_img;

    @Column(name="mood_song", columnDefinition =  "VARCHAR(255)")
    private String mood_song;



    @OneToMany(mappedBy = "mood")
    private List<Joke> Jokes = new ArrayList<>();

    @OneToMany(mappedBy = "mood")
    private List<Quotation> quotations = new ArrayList<>();



}
