package com.example.demo.quotation.joke;

import com.example.demo.quotation.mood.Mood;
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

    @Column(name="joke_name", columnDefinition = "VARCHAR(100)", nullable = false)
    private String joke_name;

    @Column(name="text", columnDefinition = "VARCHAR(100)", nullable = false)
    private String text;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mood_id")
    private Mood mood;

}
