package com.example.demo.controllers;

import java.util.Random;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exampledemo.pojos.TextToJSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

//EJERCICIO 1 CON CONTROLLER
//@Controller
//public class HomeController {
//	@GetMapping("/")
//	public ModelAndView test() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("test.html");
//		return modelAndView;
//		
//	}
	//EJERCICIO 1 CON RESTCONTROLLER
//	@RestController
//	public class HomeController {
//	@RequestMapping(path = "/")
//	public String index() {
//		return "Hola";
//	}
//	

//}

/*
 * EJERCICIO 2
@Controller
public class HomeController {
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index.html");
		return modelAndView;
	}
}*/
//JSON con TextToJSON
/*
@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping(path = "/")
	public TextToJSON index() {
		return new TextToJSON("index.html");
	}
}*/
//JSON con formato String con parametro produces="application/json" dentro del @RequestMapping
/*
@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping(path = "/", produces="application/json")
	public String index() {
		return "{\"page\": \"index.html\"}";
	}
}*/


//ObjectMapper
/*
@Controller
public class HomeController{
	@ResponseBody
	@RequestMapping("/")
	public ObjectNode index() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("key", "value");
		objectNode.put("foo", "bar");
		objectNode.put("number", 42);
		return objectNode;
	}
}*/

//ResponseEntity
/*
@Controller
public class HomeController{
	@ResponseBody
	@RequestMapping(path ="/")
	public ResponseEntity<String> index() {
		final HttpHeaders httpHeaders= new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"test\": \"Hello with ResponseEntity\"}", httpHeaders,HttpStatus.OK);
	}
}*/
// EJERCICIO 3 DEVOLVER STATUS
/*
@Controller
@RequestMapping("/")
public class HomeController {

     Random random = new Random();

    @GetMapping("/random")
    @ResponseBody
    public ResponseEntity<Integer> generateRandomNumber() {
        int num = random.nextInt(2);

        if (num == 1) {
            return new ResponseEntity<>(num, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(num, HttpStatus.OK);
        }
    }
}
*/
//EJERCICIO @ResponseStatus sin excepciones
/*
@Controller
@RequestMapping("/apiVersion")
public class HomeController {

	@ResponseStatus(value = HttpStatus.OK, reason = "Peticion correcta para el cafe")
    @RequestMapping("/hacercafe")
	public ResponseEntity<String> hacerCafe(){
		return new ResponseEntity<>("Haciendo el café",HttpStatus.OK);
	}    
	@ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "Petición correcta para el te")
    @RequestMapping("/hacerte")
    public ResponseEntity<String> hacerteTe() {
        return new ResponseEntity<>("Soy una tetera!", HttpStatus.I_AM_A_TEAPOT);
    }
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Peticion no encontrada, por tanto, correcto")
    @RequestMapping("/notfound")
    public ResponseEntity<String> notFound() {
        return new ResponseEntity<>("Petición no encontrada --> NOT FOUND", HttpStatus.NOT_FOUND);
    }
	
}*/




