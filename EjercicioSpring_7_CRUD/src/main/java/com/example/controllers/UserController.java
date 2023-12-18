package com.example.controllers;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Usuario;



@RestController
@RequestMapping("usuario")
public class UserController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	 private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<String> getAllUsers(){
		//Query que ejecutaremos
		final String query = "SELECT * FROM USERS;";
		
		//Guardamos el resultado de la query
		List<Map<String, Object>> results = jdbcTemplate.queryForList(query);
		
		//Creamos el userlist donde guardamos los usuarios
		List<String> userList = new ArrayList<String>();
		//Recorremos resultado
		for(Map<String, Object> row: results) {
			userList.add(row.toString());
		}
		return userList;
	}
	 @RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public String addUsers(
            @RequestParam String nombre, 
            @RequestParam String apellidos, 
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaNacimiento) {
		 //Query Prepared con placeholders
		final String query = "INSERT INTO users(nombre, apellidos, fechaNacimiento) VALUES (?, ?, ?)";
		log.info(query);
		
		try {
			jdbcTemplate.update(query, nombre, apellidos, fechaNacimiento);
			log.info("Se ha insertado el usuario con éxito");
			return "Usuario insertado con éxito";
		} catch (DataAccessException e) {
			e.printStackTrace();
			return "Error al insertar el usuario: " + e.getMessage();
		} catch (Exception e) {
			e.printStackTrace();
			return "Error inesperado al insertar el usuario: " + e.getMessage();
		}
	}
	 //http://localhost:8080/usuario/adduser?nombre=Pepe&apellidos=Rodriguez&fechaNacimiento=1998-09-20
	 // http://localhost:8080/usuario/deleteuser/4
	 @RequestMapping(value = "/deleteuser/{id}", method = RequestMethod.DELETE)
	 public String deleteUser(@PathVariable int id) {
		 final String query = "DELETE FROM users WHERE id = ?";
		 log.info("DELETE HECHO");
		 try {
			jdbcTemplate.update(query,id);
			return "Se ha eliminado el usuario con exito";
		 } catch (DataAccessException e) {
		        e.printStackTrace();
		        return "Error al eliminar el usuario: " + e.getMessage();
		    } catch (Exception e) {
		        e.printStackTrace();
		        return "Error inesperado al eliminar el usuario: " + e.getMessage();
		    }
	}
	 //indicamos el id en la url del que queremos modificar y luego los datos a modificar.
	 // http://localhost:8080/usuario/updateuser/6?nombre=Jose&apellidos=Sanchez&fechaNacimiento=1992-09-20
	 @RequestMapping(value = "/updateuser/{id}", method = RequestMethod.PUT)
	 public String updateUser(@PathVariable int id,
	                          @RequestParam String nombre,
	                          @RequestParam String apellidos,
	                          @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaNacimiento) {
	     final String query = "UPDATE users SET nombre = ?, apellidos = ?, fechaNacimiento = ? WHERE id = ?";
	     log.info("PUT HECHO");

	     try {
	         jdbcTemplate.update(query, nombre, apellidos, fechaNacimiento, id);
	         log.info("Se ha actualizado el usuario con éxito");
	         return "Usuario actualizado con éxito";
	     } catch (DataAccessException e) {
	         e.printStackTrace();
	         return "Error al actualizar el usuario: " + e.getMessage();
	     } catch (Exception e) {
	         e.printStackTrace();
	         return "Error inesperado al actualizar el usuario: " + e.getMessage();
	     }
	 }
}
