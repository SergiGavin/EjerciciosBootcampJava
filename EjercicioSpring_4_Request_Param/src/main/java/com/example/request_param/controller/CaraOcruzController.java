package com.example.request_param.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/juego")
public class CaraOcruzController {

    @GetMapping("/cara")
    public String requestCara() {
        return jugar(0);
    }

    @GetMapping("/cruz")
    public String requestCruz() {
        return jugar(1);
    }

    private String jugar(int eleccionUsuario) {
        Random random = new Random();
        int num = random.nextInt(2);

        if (eleccionUsuario == num) {
            return "¡Victoria! Has ganado";
        } else {
            return "¡Derrota! Has perdido";
        }
    }
}