package com.example.demo.quotation.quotation;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quotation")
@RequiredArgsConstructor

public class QuotationController {
    @Autowired
    private QuotationService quotationservice;

    @GetMapping("/get/all") //http://localhost:8080/api/v1/quotation/get/all
    public ResponseEntity<List<Quotation>> getAll(){
        List< Quotation> quotations = quotationservice.getAll();
        return new ResponseEntity<>(quotations, HttpStatus.OK);
    }


    @GetMapping("/{id}") //http://localhost:8080/api/v1/quotation/get/id
    public  Quotation getQuotationById(@PathVariable("id") Long id) {
        return quotationservice.getQuotationById(id);

    }
}
