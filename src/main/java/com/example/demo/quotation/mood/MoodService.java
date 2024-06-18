package com.example.demo.quotation.mood;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MoodService {
    @Autowired
    private MoodRepository repository;

        public List<Mood> getAll() { return repository.findAll(); }

        public Mood getMoodById(Long id){return repository.findById(id)       .orElseThrow(() -> new RuntimeException(id + " not found"));
        }
}
