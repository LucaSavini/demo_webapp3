package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController1 {

    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String helloWord () {
        return "Hello World!";
    }

    @GetMapping(path = "/ciao")
    public String ciao (
            @RequestParam(required = true) String nome,
            @RequestParam(required = false, defaultValue = "") String provincia) {
        return "ciao " + nome + " , com'è il tempo in " + provincia + " ?";
    }
}
