package com.example.demo.quotation.joke;

import com.example.demo.quotation.mood.Mood;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@Entity

public class Joke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="joke_name", columnDefinition = "VARCHAR(100)")
    private String joke_name;

    @Column(name="joke_text", columnDefinition = "VARCHAR(100)", nullable = false)
    private String joke_text;


    @ManyToOne
    @JoinColumn(name = "mood_id", nullable = false)
    @JsonBackReference
    private Mood mood;

}
