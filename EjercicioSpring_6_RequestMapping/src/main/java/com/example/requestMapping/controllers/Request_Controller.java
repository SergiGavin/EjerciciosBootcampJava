package com.example.requestMapping.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.requestMapping.pojo.Persona;

@RestController
@RequestMapping("/persona")
public class Request_Controller {
    private List<Persona> personas = new ArrayList<>();
    private static final Logger log = LoggerFactory.getLogger(Request_Controller.class);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Persona> obtenerPersonas() {
        log.info("GET hecho");
        return personas;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Persona addPersona(
            @RequestParam Integer id,
            @RequestParam String nombre,
            @RequestParam String apellidos,
            @RequestParam Integer edad) {
        log.info("POST hecho");
        Persona nuevaPersona = new Persona(id, nombre, apellidos, edad);
        personas.add(nuevaPersona);
        log.info("Persona añadida: " + nuevaPersona);
        return nuevaPersona;
    }
    // http://localhost:8080/persona/add?id=1&nombre=Sergi&apellidos=Gavin_Serrano&edad=25 

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Persona deletePersona(@RequestParam Integer id) {
        log.info("Delete hecho");

        Iterator<Persona> iterator = personas.iterator();
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            if (Integer.valueOf(persona.getId()).equals(id)) {
                iterator.remove();
                log.info("Persona eliminada: " + persona);
                return persona;
            }
        }

        log.info("Persona con ID " + id + " no encontrada");
        return null;
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Persona updatePersona(
    		@RequestParam Integer id,
            @RequestParam String nombre,
            @RequestParam String apellidos,
            @RequestParam Integer edad) {
        log.info("PUT hecho");
        for(Persona persona: personas) {
        	 if (Integer.valueOf(persona.getId()).equals(id)) {
                 if (nombre != null) {
                     persona.setNombre(nombre);
                 }
                 if (apellidos != null) {
                     persona.setApellidos(apellidos);
                 }
                 if (edad != null) {
                     persona.setEdad(edad);
                 }
                 log.info("Persona actualizada: "+ persona);
                 return persona;
        }
    }
        log.info("Persona con ID " + id + " no encontrada");
		return null;
    }
    
}
