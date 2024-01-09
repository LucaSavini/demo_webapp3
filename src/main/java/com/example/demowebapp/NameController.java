package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return "Nome: " + name;
    }

    @PostMapping("/reverse_name")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return "Nome al contrario: " + reversedName.toString();
    }
}