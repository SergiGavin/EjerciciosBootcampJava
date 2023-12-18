package com.example.path_variable.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturacion")
public class Path_variable_controller {
	 @RequestMapping(value = {"/numeroFra","/{numeroFra}/factura"})
	public String index(@PathVariable(name = "numeroFra")Optional <Integer> numeroFra) {
		if(numeroFra.isEmpty()) {
			return "El numFra no se ha introducido en el endpoint";
		}else {
			int num = numeroFra.get();
			if(num % 2 == 0) {
				return "La factura numero: "+num+" es par";
			}else {
				return "La factura numero: "+num+" es impar";
			}
		}

	}
}

