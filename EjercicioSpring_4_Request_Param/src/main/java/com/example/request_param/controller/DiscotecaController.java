package com.example.request_param.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscotecaController {
		
	
		@GetMapping("/discoteca")
		public String requestNombre(@RequestParam(required= false)Integer edad) {
			if(edad == null) {
				return "Introduzca su edad";
			}else if (edad < 18) {
				return "No puedes pasar";
			}else if(edad>=18) {
				return "Adelante mi rey";
			}
			return "Bienvenido a la discoteca. Introduzca la edad";
		}
	}
