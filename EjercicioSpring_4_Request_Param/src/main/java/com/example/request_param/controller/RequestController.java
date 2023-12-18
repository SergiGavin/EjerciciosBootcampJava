package com.example.request_param.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//Ejercicio 1
/*
@RestController
public class RequestController {
	@GetMapping("/welcome")
	public String requestNombre(@RequestParam(required= false)String name,String surname) {
		if(name==null && surname == null) {
			return "Bienvenid@ usuario no definido";
		}else if (name != null &&  surname == null) {
			return "Bienvenid@ "+name;
		}else {
			return "Bienvenid@ "+name+" "+surname;
		}
	}
}*/
//Ejercicio 2
/*
@RestController
public class RequestController {
    
    @ResponseBody
    @GetMapping(value = "/welcome", produces = "application/json")
    public ResponseEntity<Object> requestNombre(@RequestParam(required = false) String name, @RequestParam(required = false) String surname) {
        Map<String, String> response = new LinkedHashMap<>();
    	if (name == null && surname == null) {
    		response.put("name", "desconocido");
            response.put("surname", "desconocido");
        }else {
        	 response.put("name", name);
             response.put("surname", surname);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}*/
//Ejercicio 3
/*
@RestController
public class RequestController {
	private static final Logger log = LoggerFactory.getLogger(RequestController.class);
	@GetMapping("/welcome")
	public String requestNombre(@RequestParam(required= false)String name,@RequestParam(required= false)String surname) {
		if(name==null && surname == null) {
			return "La zona de parametros esta vacia. ¡No has enviado nada!";
		}else {
			log.info("El nombre es: "+name+" y su apellido es : "+surname);
		}
		return "mira el log";
	}
}*/
//Ejercicio 4


