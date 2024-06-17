package com.example.demo.quotation.contact;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@Entity
public class Contact {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @Column(name = "contact_text", columnDefinition = "TEXT", nullable = false)
        private String contact_text;


    }
