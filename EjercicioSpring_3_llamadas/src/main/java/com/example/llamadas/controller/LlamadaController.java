package com.example.llamadas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LlamadaController {
	@RequestMapping("/hola")
    public String hola() {
        return "hola";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/salut")
    public String salut() {
        return "salut";
    }
}
