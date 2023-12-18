package com.example.ej_pg_246.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
	@RestController
public class IndexController {
		@RequestMapping("/hola")
		public ModelAndView saludo() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("hola.html");
			return modelAndView;
	}
		
}
