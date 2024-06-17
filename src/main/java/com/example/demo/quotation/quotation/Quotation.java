package com.example.demo.quotation.quotation;

import com.example.demo.quotation.mood.Mood;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity

public class Quotation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="quotation_author", columnDefinition = "VARCHAR(100)")
    private String quotation_author;

    @Column(name="quotation_text", columnDefinition = "VARCHAR (250)")
    private String quotation_text;


    @ManyToOne
    @JoinColumn(name = "mood_id", nullable = false)
    @JsonBackReference
    private Mood mood;
}
