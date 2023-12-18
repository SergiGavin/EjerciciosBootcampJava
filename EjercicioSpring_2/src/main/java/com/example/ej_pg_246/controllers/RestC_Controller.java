package com.example.ej_pg_246.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestC_Controller {
	
	@RequestMapping(path = "/indexjson", produces="application/json")
	public String index() {
		return "{\"page\": \"index.html\"}";
	}
}
