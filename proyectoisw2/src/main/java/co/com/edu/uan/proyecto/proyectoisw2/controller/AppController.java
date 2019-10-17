package co.com.edu.uan.proyecto.proyectoisw2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class AppController {

	@GetMapping({"/", "/login"}) //entra por acá
	public String index() {
		return "index"; //devuelve esta url
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	
}
