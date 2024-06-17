package com.example.demo.quotation.quotation;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class QuotationService {
    @Autowired
    private QuotationRepository repository;

    public List<Quotation> getAll() {
        return repository.findAll();
    }

    public Quotation getQuotationById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(id + " not found"));
    }
}
