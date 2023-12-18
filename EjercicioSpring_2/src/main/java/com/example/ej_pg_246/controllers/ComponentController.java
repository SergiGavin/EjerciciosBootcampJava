package com.example.ej_pg_246.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ComponentController {
	@ResponseBody
	@RequestMapping(path = "/holajson", produces="application/json")
	public String index() {
		return "{\"page\": \"hola.html\"}";
	}
}
