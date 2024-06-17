package com.example.demo.quotation.contact;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contact")
@RequiredArgsConstructor

public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/get/all")
    public ResponseEntity<List<Contact>> getAll() {
        List<Contact> contacts = contactService.getAll();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
}
