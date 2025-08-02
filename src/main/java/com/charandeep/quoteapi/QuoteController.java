package com.charandeep.quoteapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @GetMapping("/quote")
    public String getQuote() {
        return "Believe in yourself! – Charandeep";
    }

@GetMapping("/")
public String home() {
    return "Welcome to the Quote API!";
}
}