package com.example.demo.quotation.mood;

import com.example.demo.quotation.joke.Joke;
import com.example.demo.quotation.quotation.Quotation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/mood")
@RequiredArgsConstructor
public class MoodController {
    @Autowired
    private MoodService moodService;

    @GetMapping("/get/all")
    public ResponseEntity<List<Mood>> getAll() {
        List<Mood> moods = moodService.getAll();
        return new ResponseEntity<>(moods, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mood> getMoodById(@PathVariable("id") Long id) {
        Mood mood = moodService.getMoodById(id);
        return new ResponseEntity<>(mood, HttpStatus.OK);
    }
    @GetMapping("/{id}/quotations")
    public ResponseEntity<List<Quotation>> getQuotationsByMoodId(@PathVariable("id") Long id) {
        Mood mood = moodService.getMoodById(id);
        List<Quotation> quotations = mood.getQuotations();
        return new ResponseEntity<>(quotations, HttpStatus.OK);
    }

    @GetMapping("/{id}/jokes")
    public ResponseEntity<List<Joke>> getJokesByMoodId(@PathVariable("id") Long id) {
        Mood mood = moodService.getMoodById(id);
        List<Joke> jokes = mood.getJokes();
        return new ResponseEntity<>(jokes, HttpStatus.OK);
    }
}
