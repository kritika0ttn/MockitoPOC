package com.testing.Mockito.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public String getProductName() {
        return "Honey";
    }
}