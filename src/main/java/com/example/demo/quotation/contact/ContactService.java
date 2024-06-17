package com.example.demo.quotation.contact;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ContactService {
    @Autowired
    private ContactRepository repository;

    public List<Contact> getAll() { return repository.findAll(); }

    public Contact getContactById(Long id){return repository.findById(id)       .orElseThrow(() -> new RuntimeException(id + " not found"));
    }

    public Contact add(Contact contact) {
        return repository.save(contact);
    }

}
